package com.example.demo.Service;

import com.example.demo.Model.product;

import java.util.List;

public interface IProductService {

    List<product> fetchAllProducts();
    product fetchOneProduct(int id);
    void createProduct(product p);
    void deleteProduct (int id);
    void editProduct(product p);
}
