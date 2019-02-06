package com.nivesh.app.ws.ui.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

	@GetMapping()
	public String getUsers(@RequestParam(value="page", defaultValue="1") int page,
			@RequestParam(value="limit",defaultValue="30") int limit) 
	{
		return "get users was called";
	}
	
	@GetMapping(path="/{userId}",produces= {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
	public String getUser(@PathVariable String userId) 
	{
		return "get user was called";
	}
	
	@PostMapping
	public String createUser() 
	{
		return "create user was called";
	}
	
	@PutMapping
	public String updateUser() 
	{
		return "update user was called";
	}
	
	@DeleteMapping
	public String deleteUser() 
	{
		return "delete user was called";
	}
}
