package com.muthu.bookapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.muthu.bookapplication.model.User;
import com.muthu.bookapplication.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	public void save(User user){
		userRepository.save(user);
	}
	public User findEmailidAndPassword(String emailid, String Password) {
		return userRepository.findByEmailAndPassword(emailid, Password);
		
	}
}
