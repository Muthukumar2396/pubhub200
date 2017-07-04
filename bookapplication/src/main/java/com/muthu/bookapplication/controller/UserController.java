package com.muthu.bookapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.muthu.bookapplication.model.User;
import com.muthu.bookapplication.repository.UserRepository;
@Controller
@RequestMapping("/users")
public class UserController {
	@Autowired
	UserRepository userRepo;
	User user = new User();

	@GetMapping("/register")
	public String login() {
		return "register";
	}

	@PostMapping("/save")
	public String add_user(@RequestParam("name") String name, @RequestParam("email") String email,
			@RequestParam("password") String password) {
		user.setName(name);
		user.setEmail(email);
		user.setPassword(password);
		userRepo.save(user);
		System.out.println("User added");
		return "redirect:/";
	}
	@GetMapping("/login")
	public String login_user() {
		return "login";
	}
	

}