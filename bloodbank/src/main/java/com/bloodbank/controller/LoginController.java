package com.bloodbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bloodbank.dao.SignupDAO;
import com.bloodbank.dto.SignupDTO;


public class LoginController {

	@Autowired
	private PasswordEncoder passwordEncoder;
	
	/*
	 * @Autowired private SignupService signupService;
	 */
	
	@Autowired
	private SignupDAO signupDAO;
	

	@GetMapping("/myCustomLogin")
	public String LoginUser() {
		return "login";
	}
	
	@GetMapping("/signup")
	public String signupGet(@ModelAttribute("signupdto") SignupDTO signupDTO ) {
		return "signup";
	}
	
	@PostMapping("/signup-process")
	public String signupPost(@ModelAttribute("signupdto") SignupDTO signupDTO ) {
		String encodedPassword = passwordEncoder.encode(signupDTO.getPassword());
		signupDTO.setPassword(encodedPassword);
		signupDAO.saveUser(signupDTO);
		return "redirect:/myCustomLogin";
	}
}
