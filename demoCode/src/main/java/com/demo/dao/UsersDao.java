package com.demo.dao;

public interface UsersDao {

	/**
	 * ת���Ǯ
	 * @param name
	 * @param money
	 * @return
	 */
	int inMoney(String name,Double money);
	
	
	/**
	 * ת����Ǯ
	 * @param name
	 * @param money
	 * @return
	 */
	int outMoney(String name,Double money);
	
}
