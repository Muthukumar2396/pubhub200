package com.muthu.bookapplication.controller;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.muthu.bookapplication.controller.AuthorController;
import com.muthu.bookapplication.model.User;
import com.muthu.bookapplication.service.UserService;

@Controller
@RequestMapping("author")
public class AuthorController {
	private static final Logger LOGGER = Logger.getLogger(AuthorController.class);

	@Autowired
	private UserService userService;

	@PostMapping("/login")
	public String login(@RequestParam("email") String email, @RequestParam("password") String password,
			ModelMap modelMap, HttpSession session) {
		LOGGER.info("Entering Login " + email + "-"+ password );
		LOGGER.debug(new Object[] { email, password });

		User user = userService.findEmailidAndPassword(email, password);
		LOGGER.info("User:" + user);
		if (user != null) {
			session.setAttribute("LOGGED_IN_USER", user);
			LOGGER.info("Login Success");
			return "redirect:../books/list";
		} else {
			modelMap.addAttribute("ERROR_MESSAGE", "Invalid Email Id/Password");
			LOGGER.error("Login Failure");
			return "home";
		}
	}
}
