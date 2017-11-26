package com.tweleve.springboot.twelve.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {
	
	@Autowired
	private userdao service = new userdao();
	
	
	//GET/users
	//retrieve all users
	@GetMapping("/users")
	public List<User> retrieveAllUsers()
	{ 	
		return service.findAll();
	}
	
	
	//retrieve a user 
	@GetMapping("users/{id}")
	public User retrieveOneUsers(@PathVariable int id )
	{ 	
		return service.find(id);
	}
	
	
	//Creating a user with POST 
	
	//input = details of the user 
	//output = created and returned URI 
	@PostMapping("/users")
	public void createUser(@RequestBody User user)
	{
		service.save(user);
	}
	

}
