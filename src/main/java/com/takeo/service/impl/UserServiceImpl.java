package com.takeo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.takeo.model.User;
import com.takeo.repo.UserRepository;
import com.takeo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public boolean register(User user) {
		// TODO Auto-generated method stub
		
		User saveEnt = userRepo.save(user);
		boolean flag =false;
		if(saveEnt!=null)
			return flag;
		else
		  return false;
	}

	@Override
	public boolean verifyUserNameAndPassWord(String uname, String pass) {
		// TODO Auto-generated method stub
		
		User user = userRepo.findByuserNameAndpassWord(uname, pass);
		boolean flag=false;
		if(user!=null)
			flag=true;
		
		return flag;
	}

}
