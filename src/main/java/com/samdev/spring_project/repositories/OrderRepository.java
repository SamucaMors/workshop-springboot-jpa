package com.samdev.spring_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samdev.spring_project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
