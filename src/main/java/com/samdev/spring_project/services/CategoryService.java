package com.samdev.spring_project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.samdev.spring_project.entities.Category;
import com.samdev.spring_project.entities.User;
import com.samdev.spring_project.repositories.CategoryRepository;

@Service
public class CategoryService {

	private CategoryRepository repository;
	
	public CategoryService (CategoryRepository repository) {
		this.repository = repository;
	}
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
