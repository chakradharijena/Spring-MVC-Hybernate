package com.bloodbank.dao;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bloodbank.dto.CampusRegistrationDTO;



@Repository
public class DefaultCampusRegistrationDao implements CampusRegistrationDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void createCampusRegistration(CampusRegistrationDTO campusRegistrationDTO) {

		String sql_insert_query = "insert into campusregistration values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		jdbcTemplate.update(sql_insert_query, campusRegistrationDTO.getOrgnType(), campusRegistrationDTO.getOrgnName(),
				campusRegistrationDTO.getOrganiserName(), campusRegistrationDTO.getOrganiserNum(),
				campusRegistrationDTO.getOrgId(), campusRegistrationDTO.getCampName(),
				campusRegistrationDTO.getCampAdd(), campusRegistrationDTO.getState(),
				campusRegistrationDTO.getDistrict(), campusRegistrationDTO.getCity(), campusRegistrationDTO.getBbank(),
				campusRegistrationDTO.getCampDate(), campusRegistrationDTO.getStarttime(),
				campusRegistrationDTO.getEndtime(), campusRegistrationDTO.getEstPart(),
				campusRegistrationDTO.getRemark());
	}

	@Override
	public List<CampusRegistrationDTO> getCampusRegistration() {
		String sql_get_query = "select * from campusregistration";
		List<CampusRegistrationDTO> campusRegistrationList = jdbcTemplate.query(sql_get_query, new BeanPropertyRowMapper<>(CampusRegistrationDTO.class));
		return Objects.nonNull(campusRegistrationList)? campusRegistrationList : Collections.emptyList();

	}

}