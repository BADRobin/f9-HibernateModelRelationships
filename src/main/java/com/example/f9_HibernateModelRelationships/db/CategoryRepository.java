package com.example.f9_HibernateModelRelationships.db;

import com.example.f9_HibernateModelRelationships.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository  extends JpaRepository<Category, Long>  {
}
