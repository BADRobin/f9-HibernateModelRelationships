package com.example.f9_HibernateModelRelationships.api_controller;


import com.example.f9_HibernateModelRelationships.db.ProductRepository;
import com.example.f9_HibernateModelRelationships.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("")
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
