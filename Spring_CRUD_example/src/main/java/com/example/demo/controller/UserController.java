package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService service;
	
	 @PostMapping("/addUser")
	    public User addUser(@RequestBody User user) {
	        return service.saveUser(user);
	    }

	 @PostMapping("/addUsers")
	    public List<User> Users(@RequestBody List<User> users) {
	        return service.saveProducts(users);
	    }
	 
	 @GetMapping("/users")
	    public List<User> findAllUsers() {
	        return service.getUsers();
	    }

	    @GetMapping("/userById/{id}")
	    public User findUserById(@PathVariable int id) {
	        return service.getUserById(id);
	    }
	 
	    @PutMapping("/update")
	    public User updateProduct(@RequestBody User user) {
	        return service.updateUser(user);
	    }

	    @DeleteMapping("/delete/{id}")
	    public String deleteUser(@PathVariable int id) {
	        return service.deleteUser(id);
}
}
