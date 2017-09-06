package com.demo2;

import org.junit.Test;

/**
 * À„∑®
 * @author shi
 *
 */
public class algorithmDemo {

	
	/**
	 * √∞≈›≈≈–Ú
	 */
	@Test
	public void algorithm1() {
		
		Integer[] nums = new Integer[] { 2, 4, 1, 5, 3 };

		for (int i = 0; i < nums.length - 1; i++) {

			for (int j = i; j < nums.length; j++) {

				if (nums[j] < nums[i]) {
					int num = nums[i];
					nums[i] = nums[j];
					nums[j] = num;
				}

			}

		}

		for (Integer integer : nums) {
			System.out.println(integer);
		}
	}
	
	
	/**
	 * ≤Â»Î≈≈–Ú
	 */
	@Test
	public void algorithm2() {
		
		Integer[] nums = new Integer[] { 2, 4, 1, 5, 3 };

		for (int i = 0; i < nums.length; i++) {

			for (int j = nums.length - 1; j > i; j--) {

				if (nums[j] < nums[j - 1]) {

					int num = nums[j];
					nums[j] = nums[j - 1];
					nums[j - 1] = num;

				}

			}

		}

		for (Integer integer : nums) {
			System.out.println(integer);
		}
	}
	
	
	
	
}
