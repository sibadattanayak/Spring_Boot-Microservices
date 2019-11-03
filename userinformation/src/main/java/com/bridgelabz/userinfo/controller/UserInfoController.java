package com.bridgelabz.userinfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bridgelabz.userinfo.model.UserInformation;
import com.bridgelabz.userinfo.service.UserService;
import com.bridgelabz.userinfo.service.UserServiceImplementation;

@RestController
@RequestMapping(value = "/userinfo")
public class UserInfoController {

	UserService userService = new UserServiceImplementation();
	@Autowired
	private UserInformation userInformation;

	@Autowired
	private RestTemplate restTemplate;

	@PostMapping(value = "/login/{userEail}")
	public ResponseEntity<Object> userLogin(@PathVariable("userEmail") String userEmail,
			@RequestHeader String userPassword) {
		//restTemplate.
		//getForObject("http://localhost:8081/userinfo,"+userInformation.getUserEmail()+"/"+userInformation.getUserPassword(),UserInformation.class);
		userService.login(userEmail, userPassword);
		return new ResponseEntity<Object>(userInformation, HttpStatus.ACCEPTED);
	}

	@PostMapping(value = "/registration")
	public ResponseEntity<UserInformation> userRegistration(@RequestBody UserInformation userInformation) {
		userService.registration(userInformation);
		return new ResponseEntity<UserInformation>(userInformation, HttpStatus.CREATED);
	}

}
