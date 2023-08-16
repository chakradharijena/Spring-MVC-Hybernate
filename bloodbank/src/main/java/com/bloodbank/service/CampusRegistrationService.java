package com.bloodbank.service;

import java.util.List;

import com.bloodbank.dto.CampusRegistrationDTO;



public interface CampusRegistrationService {

	void createCampusRegistration(CampusRegistrationDTO campusRegistrationDTO);
	List<CampusRegistrationDTO> getCampusRegistration();
}
