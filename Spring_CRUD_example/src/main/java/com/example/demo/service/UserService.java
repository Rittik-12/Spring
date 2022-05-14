package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserRepository;
import com.example.demo.model.User;

@Service
public class UserService {
	
	
	    @Autowired
	    private UserRepository repository;

	    public User saveProduct(User user) {
	        return repository.save(user);
	    }

	    public List<User> saveUsers(List<User> users){
	    	return repository.saveAll(users);
	    }
          
	    public List<User> getUsers(){
	    	return repository.findAll();
	    }
	    
	    public User getUserById(int id) {
	        return repository.findById(id).orElse(null);
	    }
	    
	    public User getUserByName(String name) {
	        return repository.findByName(name);
	        
	        
	    }
	    
	    public String deleteUser(int id) {
	        repository.deleteById(id);
	        return "product removed !! " + id;
	    }
	    
	    public User updateUser(User user) {
	        User existingUser = repository.findById(user.getId()).orElse(null);
	        existingUser.setName(user.getName());
	        existingUser.setCity(user.getCity());
	        existingUser.setStatus(user.getStatus());
	        return repository.save(existingUser);
	    }

		public User saveUser(User user) {
			// TODO Auto-generated method stub
			return null;
		}

		public List<User> saveProducts(List<User> users) {
			// TODO Auto-generated method stub
			return null;
		}
	    
	    
	    

}
