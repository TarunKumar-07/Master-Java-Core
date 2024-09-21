package com.masterCore;

public class P2_SimpleArithmetic {
public static void main(String[] args) {
	int a = 10, b=20;

//	System.out.println(String.format("a+b: %d", a + b));
// or 
	System.out.printf("a+b:%d\n",(a+b)); //use this method always
	System.out.printf("a-b:%d\n",(a-b));
	System.out.printf("a*b:%d\n",(a*b));
	System.out.printf("b/a:%f\n",(float)(a/b));
	System.out.printf("a%%b:%d\n",(a%b));
	System.out.printf("a^b:%d",(a^b)); //it is XOR not exponentiation
}
}
