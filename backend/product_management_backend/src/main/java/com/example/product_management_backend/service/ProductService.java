package com.example.product_management_backend.service;

import com.example.product_management_backend.model.Product;

import java.util.List;

public interface ProductService {

    public Product saveProduct(Product product);

    public List<Product> getAllProduct();

    public Product getProductById(Integer id);

    public String deleteProduct(Integer id);

    public Product update(Product product, Integer id);
}
