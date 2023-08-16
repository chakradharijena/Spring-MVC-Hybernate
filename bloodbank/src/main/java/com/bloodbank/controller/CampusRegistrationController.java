package com.bloodbank.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bloodbank.dto.CampusRegistrationDTO;
import com.bloodbank.service.CampusRegistrationService;

@Controller
public class CampusRegistrationController {

	@Autowired
	CampusRegistrationService campusRegistrationService;
	
	@GetMapping("/campRegistration")
	public String loadCampusRegistrationPage( ) {
		return "campusregistrationpage";
	}
	
	@PostMapping("/campRegistration")
	public void campRegistrationForm(@ModelAttribute("campusRegistrationdto") 
	CampusRegistrationDTO campusRegdto, final HttpServletRequest request ) {
		final String districtValue = request.getParameter("dist");
		campusRegdto.setDistrict(districtValue);
		campusRegistrationService.createCampusRegistration(campusRegdto);
	}
	
	@PostMapping("/getCampusRegistration")
	public void getCampusRegistration() {
		campusRegistrationService.getCampusRegistration();
	}
	
}
