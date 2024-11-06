package com.example.f9_HibernateModelRelationships.db;

import com.example.f9_HibernateModelRelationships.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
