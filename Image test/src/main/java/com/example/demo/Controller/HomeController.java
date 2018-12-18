package com.example.demo.Controller;

import com.example.demo.Model.product;
import com.example.demo.Service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @Autowired
    IProductService productService;



    @GetMapping("/adminViewAll")
    public String home(Model model) {
        model.addAttribute("products", productService.fetchAllProducts());
        return "home/adminviewall";
    }

    @GetMapping("/create")
    public String createArt() {
        return "home/index";
    }

    @PostMapping("/newProduct")
    public String create(@ModelAttribute product student, Model model) {
        model.addAttribute("products",student);
        productService.createProduct(student);
        return "redirect:/adminViewAll";
    }

    @GetMapping("/")
    public String allProducts(Model model) {
        model.addAttribute("products", productService.fetchAllProducts());
        return "home/viewall";
    }

    @GetMapping("/seeAll")
    public String readAll(Model model){
        return "/seeall";
    }

    @GetMapping("/contact")
    public String contact(){
        return "home/contact";
    }

    @GetMapping("/about")
    public String about(){
        return "home/about";
    }

    @GetMapping("/details/{id}")
    public String details(@PathVariable("id") int id, Model model){
        model.addAttribute("products", productService.fetchOneProduct(id));
        return "home/details";

    }

    @GetMapping("/delete/{id}")
    public String delete (@PathVariable("id") int id, Model model){
        model.addAttribute("products", productService.fetchOneProduct(id));
        return "home/delete";
    }

    @PostMapping("/delete")
    public String delete (@ModelAttribute("id") int id){
        productService.deleteProduct(id);
        return "redirect:/adminViewAll";

    }

    @GetMapping("/edit/{id}")
    public String update(@PathVariable("id") int id, Model model){
        model.addAttribute("products", productService.fetchOneProduct(id));
        return "home/edit";
    }

    @PostMapping("/edit")
    public String update(@ModelAttribute product product){
        productService.editProduct(product);
        return "redirect:/adminViewAll";
    }




}
