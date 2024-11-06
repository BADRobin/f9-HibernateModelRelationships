package com.example.f9_HibernateModelRelationships.controller;

import com.example.f9_HibernateModelRelationships.db.CategoryRepository;
import com.example.f9_HibernateModelRelationships.db.ProductRepository;
import com.example.f9_HibernateModelRelationships.models.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class AppController {

    @Autowired
    CategoryRepository categoryRepository;
    @Autowired
    ProductRepository productRepository;
    @GetMapping("/")
    public String index(Model model) {
        List<Category> categoryList= categoryRepository.findAll();
        model.addAttribute("categoryList", categoryList);
        return "index";
    }

    @GetMapping("/{categorySlug}")
    public String category(@PathVariable String categorySlug, Model model) {
        System.out.println(categorySlug);
        model.addAttribute("slug", categorySlug);

        // Show all the products that belong to this slug
        // remember we don't have the id just the slug to find the category
        // and respective products...

        return "category";
    }
}
