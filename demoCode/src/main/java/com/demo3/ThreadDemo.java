package com.demo3;

public class ThreadDemo extends Thread {
	
	int num;
	
	public ThreadDemo(int num) {
		this.num = num;
	}
	
	
	@Override
	public void run() {
		
		ThreadLock.pront(num);
		
	}
	
}
