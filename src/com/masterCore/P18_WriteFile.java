package com.masterCore;

//import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class P18_WriteFile {

	public static void main(String[] args) {
		try {
			FileWriter wFile = new FileWriter("sample.txt");
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the content: ");
			String str = scan.nextLine();
			System.out.println("File created successfully...");
			wFile.write(str);
//			File rFile = new File("sample.txt");
//			Scanner reader = new Scanner(rFile);
//			System.out.println(rFile.getAbsolutePath());
//			if (rFile.canRead()) {
//				System.out.println("File is readable...\nFile Content is:");
//				while (reader.hasNextLine())
//					System.out.println(reader.nextLine());
//			}
			wFile.close();
			scan.close();
//			reader.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
