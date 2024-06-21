package com.akash.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akash.DTO.User;
import com.akash.Service.IUserService;

@RestController
@RequestMapping("/api/v2")
public class UserController {

	@Autowired
	private IUserService service;

	@PostMapping("/post")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		User createUser = this.service.createUser(user);
		return new ResponseEntity<User>(createUser, HttpStatus.CREATED);
	}

	@GetMapping("/get")
	public ResponseEntity<List<User>> filterUser() {
		List<User> filterUser = this.service.filterUser();
		return new ResponseEntity<List<User>>(filterUser, HttpStatus.OK);
	}
}
