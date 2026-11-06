package com.samdev.spring_project.services;

import java.util.List;
import java.util.Optional;

import com.samdev.spring_project.services.exceptions.ResourceNotFoundException;
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
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}

	public User insert(User user){
		return repository.save(user);
	}

	public void delete(Long id){
		repository.deleteById(id);
	}
	
	public User update(Long id, User user) {
		User entity = repository.getReferenceById(id);
		updateData(entity, user);
		return repository.save(entity);
		
	}
	
	public void updateData(User entity, User user) {
		entity.setName(user.getName());
		entity.setEmail(user.getEmail());
		entity.setPhone(user.getPhone());
	}
	

}
