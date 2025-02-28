package com.example.product.controllers;

import com.example.product.entities.Product;
import com.example.product.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/")
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @PostMapping("/")
    public Product addProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }
}
