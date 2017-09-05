package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class UsersDaoImpl implements UsersDao {

	@Autowired
	private JdbcTemplate jdbcTemplate ;
	
	
	@Override
	public int inMoney(String name, Double money) {
		
		String sql = "update users set money=(money + ?) where name = ?";
		
		return jdbcTemplate.update(sql, money,name);
	}

	@Override
	public int outMoney(String name, Double money) {
		
		String sql = "update users set money=(money - ?) where name = ?";
		return jdbcTemplate.update(sql, money,name);
		

	}

}
