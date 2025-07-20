/*
FizzBuzz Test:
Write a program that prints numbers from 1 to 100. However, for multiples of 3, print "Fizz"
instead of the number, and for multiples of 5, print "Buzz."
For numbers that are multiples of both 3 and 5, print "FizzBuzz."
*/

package Interview_PreparationApril2025.Coding_IQ;

import java.util.Scanner;

public class FizzBuzzEx {
    public static void main(String[] args) {

//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter a number to print");
//        int n = s.nextInt();


//        System.out.println("The numbers are");
        for(int i=1;i<=100;i++)
        {
            if(i%3==0 && i%5==0)
            {
                System.out.println("FizzBuzz");
            }
            else if(i%3==0)
            {
                System.out.println("Fizz");
            }
            else if(i%5==0)
            {
                System.out.println("buzz");
            }
            else
            {
                System.out.println(i);
            }
        }
    }
}
