package com.bloodbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bloodbank.dao.CampusRegistrationDao;
import com.bloodbank.dto.CampusRegistrationDTO;


@Component
public class DefaultCampusRegistrationService implements CampusRegistrationService {

	@Autowired
	CampusRegistrationDao campusRegistrationDao;
	
	@Override
	public void createCampusRegistration(CampusRegistrationDTO campusRegistrationDTO) {
		campusRegistrationDao.createCampusRegistration(campusRegistrationDTO);
	}

	@Override
	public List<CampusRegistrationDTO> getCampusRegistration() {
		return campusRegistrationDao.getCampusRegistration();
	}

}

