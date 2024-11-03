package com.wmsoftware.cefetsis.service;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.wmsoftware.cefetsis.model.User;
import com.wmsoftware.cefetsis.repository.UserRepository;

@Service
public class UserService {
	
	private final UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public ResponseEntity<User> findById(Long id) {
        return userRepository.findById(id).map(client -> ResponseEntity.ok(client))
        		.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }
	
	public User register (User user){
		user. setId(UUID.randomUUID());
		return userRepository.save(user);
	}
	
}
