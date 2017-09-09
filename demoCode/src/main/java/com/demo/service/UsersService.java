package com.demo.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import com.demo.dao.UsersDao;


@Service
@Transactional
public class UsersService {

	@Resource(name="usersDaoImpl")
	private UsersDao usersDao;
	
	@Resource(name="transactionTemplate")
	private TransactionTemplate transactionTemplate;
	
	
	
	public void setUsersDao(UsersDao usersDao) {
		this.usersDao = usersDao;
	}

	
	
	public int transfer(String in,String out,Double money) {
		
		
		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
			
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus arg0) {
				// TODO Auto-generated method stub
				usersDao.outMoney(out, money);
				int a = 1 /0;
				usersDao.inMoney(in, money);
			
			}
		});
		
		return 1;
	}
	
}
