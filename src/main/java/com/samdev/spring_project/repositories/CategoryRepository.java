package com.samdev.spring_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samdev.spring_project.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
