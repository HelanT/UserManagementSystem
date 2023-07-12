package com.takeo.service;

import com.takeo.model.User;

public interface UserService {
	
	public boolean register(User user);
	
	public boolean verifyUserNameAndPassWord(String uname, String pass);
	
	
	

}
