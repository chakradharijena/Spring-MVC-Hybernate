package com.bloodbank.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bloodbank.dto.SignupDTO;


@Repository
public class DefaultSignupDAOImpl implements SignupDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void saveUser(SignupDTO signupDto) {
		String sql_insert_query = "insert into users values(?,?,?)";
		String sql_insert_authority = "insert into authorities values(?,?)";
		jdbcTemplate.update(sql_insert_query, signupDto.getUsername(), signupDto.getPassword(), 1);
		jdbcTemplate.update(sql_insert_authority, signupDto.getUsername(), "USER");
	}
	
	

}
