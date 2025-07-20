/*
Leap Year Program - Find 2024
Create a program that determines whether a given year is a leap year.
A leap year is divisible by 4, but not by 100 unless it is also divisible by 400.
Use an if-else statement to make this determination.
 */

package Interview_PreparationApril2025.Coding_IQ;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LeapYearEx {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("enter a year");
        int year=s.nextInt();

        if((year%4==0 && year%100!=0) || (year%400==0))
        {
            System.out.println(year + " is a Leap Year.");
        }
        else
        {
            System.out.println(year + " is not a Leap Year.");
        }
    }
}
