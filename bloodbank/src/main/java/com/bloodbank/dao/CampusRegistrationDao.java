package com.bloodbank.dao;

import java.util.List;

import com.bloodbank.dto.CampusRegistrationDTO;


public interface CampusRegistrationDao {
void createCampusRegistration(CampusRegistrationDTO campusRegistrationDTO);
	
	List<CampusRegistrationDTO> getCampusRegistration();

}
