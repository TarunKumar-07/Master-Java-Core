package com.masterCore;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P24_StreamAPI {

	public static void main(String[] args) {
		 // List of integers
		List<Integer> numbers = Arrays.asList(5, 12, 8, 21, 1, 7, 10, 2, 15);
		// Filter the numbers greater than 5, sort them, and collect to a new list
		List<Integer> filteredAndSorted = numbers.stream()
				.filter(n -> n > 5)				// Filter numbers greater than 5
				.sorted()						// Sort them
				.collect(Collectors.toList());	// Collect into a new list
		
		System.out.println(filteredAndSorted);

	}

}
