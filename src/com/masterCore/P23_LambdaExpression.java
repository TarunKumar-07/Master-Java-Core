package com.masterCore;

import java.util.ArrayList;

public class P23_LambdaExpression {

	public static void main(String[] args) {
		ArrayList<String> strArr = new ArrayList<String>();
		strArr.add("Tarun");
		strArr.add("Taksheel");
		strArr.add("Talank");
		strArr.add("Taruna");
		strArr.add("Tanya");
		strArr.add("Tanisha");
		strArr.add("Tushar");
		strArr.add("Tanmay");
		strArr.add("Tanaya");
		strArr.add("Tabu");
		strArr.add("Tananjay");
		strArr.add("Tosu");
		
		strArr.forEach((i)->{
			System.out.println(i);
		});

	}

}
