package com.samdev.spring_project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.samdev.spring_project.entities.Order;
import com.samdev.spring_project.repositories.OrderRepository;

@Service
public class OrderService {
	
	private OrderRepository repository;
	
	public OrderService(OrderRepository repository) {
		this.repository = repository;
	}
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
