package com.kpit.login.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kpit.login.entity.User;
import com.kpit.login.repository.UserRepository;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired 
	private UserRepository userRepo;
	
	
	@GetMapping
	public List<User> getAllUser(){
		return userRepo.findAll();
	}
	
	@PostMapping
	public boolean createUser(@RequestBody User newUser) {
		userRepo.save(newUser);
		return true;
	}
	
	@GetMapping("id/{myId}")
	public Optional<User> getUserById(@PathVariable Long myId) {
		return userRepo.findById(myId);
	}
	
	@DeleteMapping("id/{myId}")
	public void deleteById(@PathVariable Long myId) {
		 userRepo.deleteById(myId);
	}
	
	@PutMapping("id/{id}")
	public User updateUser(@PathVariable Long id, @RequestBody User updatedUser) {
		return userRepo.save(updatedUser);
	}
	

}
