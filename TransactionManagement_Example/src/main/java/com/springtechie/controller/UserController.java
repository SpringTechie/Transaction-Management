package com.springtechie.controller;


import com.springtechie.serviceimpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springtechie.model.User;

@RestController
public class UserController 
{

    @Autowired
	private UserServiceImpl userService;
    
   @PostMapping("/save")
   @Transactional
   public User saveEmployeeIntoDatabase(@RequestBody User user)
   {
	  return userService.saveUser(user);
   }
 
   
}
