package com.techrat.OrderApp.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techrat.OrderApp.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User testUser = new User(1L, "Mary", "Mary@gmail.com", "9999999", "12345");
		return ResponseEntity.ok().body(testUser);
	}
}
