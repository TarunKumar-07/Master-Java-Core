package com.masterCore;

import java.util.HashSet;

public class P16_HashSet {

	public static void main(String[] args) {
		HashSet<String> names  = new HashSet<String>();
		names.add("Tarun");
		names.add("Varun");
		names.add("Arun");
		names.add("Tarun");
		names.add("Taruna");
		names.add("Karuna");
		names.forEach((i) -> {
			System.out.println(i);
		});
	}

}
