package com.masterCore;

import java.util.Scanner;

public class P21_StringManipulation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string to check palindrome: ");
		String str = scan.nextLine();
		String rev = "";
		for (int i = str.length()-1; i >= 0 ; i--) {
			rev += str.charAt(i);
		}
		if(str.equals(rev))
			System.out.println("It is a Palindrome");
		else
			System.out.println("It is not a Palindrome");
		
		scan.close();
	}

}
