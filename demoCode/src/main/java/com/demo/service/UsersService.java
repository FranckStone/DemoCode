package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.UsersDao;


@Service
@Transactional
public class UsersService {

	@Autowired
	private UsersDao usersDao;
	
	public void setUsersDao(UsersDao usersDao) {
		this.usersDao = usersDao;
	}

	public int transfer(String in,String out,Double money) {
		
		usersDao.outMoney(out, money);
		usersDao.inMoney(in, money);
		return 1;
	}
	
}
