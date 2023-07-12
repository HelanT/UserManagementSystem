package com.takeo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.takeo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	
	User findByuserNameAndpassWord(String uname, String pass);
}
