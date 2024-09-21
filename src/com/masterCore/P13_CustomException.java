package com.masterCore;

public class P13_CustomException {
	static void checkAge(int age) throws Exception {
		if(age < 18)
			throw new Exception("Invalid age for voting!!");
		else
			System.out.println("You can vote.");
		
	}

	public static void main(String[] args) {
		try {
			checkAge(16);
		} catch (Exception e) {
			System.err.println(e);
			System.err.println("something wrong in main....");
		}

	}

}
