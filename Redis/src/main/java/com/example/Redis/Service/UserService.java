package com.example.Redis.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Redis.Entity.User;
import com.example.Redis.Repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public User createUser(User user) {
		return userRepository.save(user);
	}
	
	public Optional<User> getUserId(String id){
		return userRepository.findById(id);
	}
	
	public Iterable<User> getAllUser(){
		return userRepository.findAll();
	}
	
	public void deleteUser(String id) {
		userRepository.deleteById(id);
	}
	
	public User updateUser(User user) {
        return userRepository.save(user);
    }
}
