package com.demo.dao;

public interface UsersDao {

	/**
	 * 转入的钱
	 * @param name
	 * @param money
	 * @return
	 */
	int inMoney(String name,Double money);
	
	
	/**
	 * 转出的钱
	 * @param name
	 * @param money
	 * @return
	 */
	int outMoney(String name,Double money);
	
}
