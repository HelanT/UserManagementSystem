package com.takeo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.takeo.model.User;
import com.takeo.service.impl.UserServiceImpl;

@RestController
public class UserController {
	
	@Autowired
	public UserServiceImpl daoService;
	
	
	@PostMapping("/users")
    public ResponseEntity<String> createUser(@Valid @RequestBody User user)
    {
		boolean flag=daoService.register(user);
		String msg="";
		if(flag)
			msg="Registered Successfully";
		else
			msg="Try after some time";
		
    	return ResponseEntity.ok(HttpStatus.OK).ok(msg);
    	
    }
	
	@GetMapping("/users/{uname}/{pass}")
	public String verifyUserNameAndPassWord(@PathVariable String uname, String pass)
	{
		boolean flag = daoService.verifyUserNameAndPassWord(uname, pass);
		
		String msg="";
		if(flag)
			msg="Valid User";
		else
			msg="Invalid User";
		
		return null;
		
		
		/*
		 * ResponseEntity represents the whole HTTP response: status code, headers, and
		 * body. As a result, we can use it to fully configure the HTTP response. If we
		 * want to use it, we have to return it from the endpoint; Spring takes care of
		 * the rest. ResponseEntity is a generic.
		 */




		

		
	}

}
