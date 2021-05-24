package com.behiye.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.behiye.domain.User;
import com.behiye.domain.UserLogin;
import com.behiye.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userservice;

	public UserService getUserservice() {
		return userservice;
	}

	public void setUserservice(UserService userservice) {
		this.userservice = userservice;
	}

	@GetMapping("/login")
	public String loginPage(Model model) {
		UserLogin userLogin = new UserLogin();
		model.addAttribute("userLogin", userLogin);
		return "login";
	}

	@PostMapping("/login-success")
	public String loginSuccess(@Valid @ModelAttribute UserLogin userLogin, BindingResult bindingResult,
			ModelMap modelMap, HttpSession oturum) {

		if (bindingResult.hasErrors()) {
			return "login";
		}

		// System.out.println("user " + userLogin.getEmail() + userLogin.getPassword());
		User user = getUserservice().validateUserLogin(userLogin.getEmail(), userLogin.getPassword());

		if (user != null) {
			oturum.setAttribute("oturum", user.getName());
			return "welcome";
		} else {
			modelMap.put("error", "Invalid Account");
			return "login";
		}
	}

}
