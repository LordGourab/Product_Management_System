package com.example.product_management_backend.controller;

import com.example.product_management_backend.model.Product;
import com.example.product_management_backend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/saveProduct")
    public ResponseEntity saveProduct(@RequestBody Product product)
    {
            return new ResponseEntity<>(productService.saveProduct(product), HttpStatus.CREATED);
    }
    @GetMapping("/")
    public ResponseEntity getAllProduct()
    {
        return new ResponseEntity(productService.getAllProduct(),HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity getProductById(@PathVariable Integer id)
    {
        return new ResponseEntity(productService.getProductById(id),HttpStatus.OK);
    }
    @GetMapping("/deleteProduct/{id}")
    public ResponseEntity deleteProduct(@PathVariable Integer id)
    {


        return new ResponseEntity(productService.deleteProduct(id),HttpStatus.OK);
    }
    @PostMapping("/editProduct/{id}")
    public ResponseEntity editProduct(@RequestBody Product product,@PathVariable Integer id)
    {
        return new ResponseEntity(productService.update(product,id),HttpStatus.CREATED);
    }
}
