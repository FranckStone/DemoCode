package com.demo3;

public class ThreadLock {

	
	public static void pront(int num) {
			
			synchronized (ThreadLock.class) {
				System.out.println(Thread.currentThread().getName()+":"+num);
			}
		
		
	}
	
}
