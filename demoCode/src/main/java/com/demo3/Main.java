package com.demo3;

import org.junit.Test;

public class Main {

	
	
	/**
	 * 
	 * �̲߳���(û����)
	 * @throws InterruptedException 
	 * 
	 */
	@Test
	public void demo1() throws InterruptedException {
		
		for(int i = 0 ; i <10 ;i++) {
			ThreadDemo threadDemo = new ThreadDemo(i);

		}
		
		Thread.sleep(1000);
	}
	
	
	
	/**
	 * 
	 * �̲߳���(����)
	 * @throws InterruptedException 
	 * 
	 */
	@Test
	public void demo2() throws InterruptedException {
		
		for(int i = 0 ; i <10 ;i++) {
		
				ThreadDemo threadDemo = new ThreadDemo(i);
				threadDemo.start();

		}
		
		Thread.sleep(1000);
	}
	

	
	
	
	
	
	
}
