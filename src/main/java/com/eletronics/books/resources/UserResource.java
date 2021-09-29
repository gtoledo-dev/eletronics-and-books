package com.eletronics.books.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eletronics.books.entity.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> finAll() {
		
		User user = new User(1L, "Maria", "maria@gmail.com", "11944556677", "12345");
		return ResponseEntity.ok().body(user);
		
	}

}
