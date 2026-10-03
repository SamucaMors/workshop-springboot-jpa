package com.samdev.spring_project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.samdev.spring_project.entities.User;
import com.samdev.spring_project.repositories.UserRepository;

@Service
public class UserService {
	
	private UserRepository repository;
	
	public UserService(UserRepository repository) {
		this.repository = repository;
	}
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}

}
