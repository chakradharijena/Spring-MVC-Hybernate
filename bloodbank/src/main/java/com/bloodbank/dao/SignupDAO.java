package com.bloodbank.dao;

import com.bloodbank.dto.SignupDTO;

public interface SignupDAO {
	void saveUser(SignupDTO dto);
}
