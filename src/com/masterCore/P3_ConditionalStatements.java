package com.masterCore;

import java.util.Scanner;

public class P3_ConditionalStatements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number:");
		int n = scan.nextInt();
		if(n > 0)
			System.out.println("It is Positive(+)");
		else if(n < 0)
			System.out.println("It is Negative(-)");
		else
			System.out.println("It is Zero(0)");
		scan.close();
	}

}
