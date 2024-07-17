package com.crypto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crypto.model.User;
import com.crypto.repository.UserRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/auth")
public class AuthController {

	@Autowired
	private UserRepository userRepository;

	@PostMapping("/signup")
	public ResponseEntity<User> register(User user) {

		User newUser = new User();
		newUser.setEmail(user.getEmail());
		newUser.setPassword(user.getPassword());
		newUser.setEmail(user.getEmail());

		User savedUser = userRepository.save(newUser);
		return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
	}
}
