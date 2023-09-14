/*
*  Assignment [Assignment 3]
*  Description: [Leap Year Calculator ]
*  Name: [Shahriz Malek]
*  ID: [920378989]
*  Class: CSC 210-04
*  Semester: Spring 2020
*/

import java.util.Scanner;

public class LeapYears {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); //Scanner input created 
        int year; //year var
        
        System.out.println("Leap Year finder, enter a year to continue: ");
        
        year = input.nextInt(); 
        
        boolean leap = (year % 4 == 0); //check if the year is divisible by 4
        leap = leap && (year % 100 != 0); //check if the year is not divisible by 100
        leap = leap || (year % 400 == 0); //check if the year is divisible by 400
        
        if(leap){ 
            System.out.println(year + " is a leap year");
        }
        else {
            System.out.println(year + " is not a leap year!");
        }
        /* 
            this if statement takes the leap var and checks if its its a leap year if not then it moves on to
            the else statement
        */
    }
}
