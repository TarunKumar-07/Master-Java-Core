package com.masterCore;

import java.io.File;
import java.util.Scanner;
public class P17_ReadFile {

	public static void main(String[] args) {
		try {
			File file = new File("Program List.txt");
			Scanner reader = new Scanner(file);
			if(file.canRead()) {
				System.out.println("File is readable...");
				System.out.println(file.getAbsolutePath());
				System.out.println("FILE CONTENT BELOW:\n\n");
				while(reader.hasNextLine()) {
					String line = reader.nextLine();
					System.out.println(line);
				}
				reader.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
