package com.samdev.spring_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samdev.spring_project.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
