package com.demo.main;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.demo.service.UsersService;


@RunWith(SpringJUnit4ClassRunner.class)     //��ʾ�̳���SpringJUnit4ClassRunner��  
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})  
public class jdbcDemo {

	
	private static Logger logger = Logger.getLogger(jdbcDemo.class);  

    @Resource(name="usersService")
    private UsersService usersService; 
    
    
    
	/**
	 * ���������һ��
	 */
	@Test
	public void demo1() {
		
		usersService.transfer("aaa", "bbb", 200d);
		
	}
	
}
