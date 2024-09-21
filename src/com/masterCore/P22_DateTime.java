package com.masterCore;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class P22_DateTime {

	public static void main(String[] args) {
        
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Print the current date and time with all part
        System.out.println("Current Date and Time all at once: " + currentDateTime);
//----------------------------------------------------------------------------------

        // Extract the date part
        LocalDate date = currentDateTime.toLocalDate();

        // Extract the time part
        LocalTime time = currentDateTime.toLocalTime();

        // Print the date and time separately
        System.out.println("\nDate Part: " + date);
        System.out.println("Time Part: " + time);
        
//----------------------------------------------------------------------------------
        // Get the current local date and time
        // Extract individual elements
        int year = currentDateTime.getYear();
        int month = currentDateTime.getMonthValue(); // Month as a number (1-12)
        int day = currentDateTime.getDayOfMonth();
        int hour = currentDateTime.getHour();
        int minute = currentDateTime.getMinute();
        int second = currentDateTime.getSecond();
        int nanosecond = currentDateTime.getNano(); // For milliseconds
        
        

        // Print each element
        System.out.println("\nYear: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);
        System.out.println("Second: " + second);
        System.out.println("Millisecond: " + (nanosecond / 1_000_000));

	}

}
