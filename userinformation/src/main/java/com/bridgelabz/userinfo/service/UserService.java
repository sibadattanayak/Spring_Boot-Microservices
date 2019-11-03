package com.bridgelabz.userinfo.service;

import com.bridgelabz.userinfo.model.UserInformation;

public interface UserService {

	String login(String userEmail, String userPassword);

	UserInformation registration(UserInformation userInformation);

}
