package com.bridgelabz.userinfo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bridgelabz.userinfo.model.UserInformation;
import com.bridgelabz.userinfo.repository.UserRepository;

@Component
public class UserServiceImplementation implements UserService {

	@Autowired
	UserInformation userDetails;
	@Autowired
	UserRepository userRepository;

	@Override
	public String login(String userEmail, String userPassword) {

		Optional<UserInformation> userInfo = userRepository.findByUserEmail(userEmail);

		if (userInfo.isPresent() && userInfo.get().getUserPassword().matches(userPassword)) {

		} else {
			return "Password didn't match";
		}

		return "Inside User Loggin";
	}

	@Override
	public UserInformation registration(UserInformation userInformation) {
		userInformation = userRepository.saveAll(userInformation);
		return null;
	}

}
