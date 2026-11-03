package com.samdev.spring_project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.samdev.spring_project.entities.Product;
import com.samdev.spring_project.repositories.ProductRepository;

@Service
public class ProductService {

	private ProductRepository repository;
	
	public ProductService(ProductRepository repository) {
		this.repository = repository;
	}
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
