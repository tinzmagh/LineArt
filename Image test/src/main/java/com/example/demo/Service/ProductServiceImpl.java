package com.example.demo.Service;

import com.example.demo.Model.product;
import com.example.demo.Repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductRepo productRepo;

    @Override
    public List<product> fetchAllProducts() {
        return productRepo.findAll();
    }

    @Override
    public product fetchOneProduct(int id) {
        return productRepo.getOne(id);
    }

    @Override
    public void createProduct(product p) {
        productRepo.save(p);
    }

    @Override
    public void deleteProduct(int id) {
        productRepo.deleteById(id);
    }

    @Override
    public void editProduct(product p) {
        productRepo.save(p);
    }

}
