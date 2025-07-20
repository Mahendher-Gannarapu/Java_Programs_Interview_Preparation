package Interview_PreparationApril2025.Coding_IQ;

import java.util.Scanner;

/*
Triangle Classifier ( If)
Write a program that classifies a triangle based on its side lengths.
Given three input values representing the lengths of the sides, determine
if the triangle is equilateral (all sides are equal),
isosceles (exactly two sides are equal), or
scalene (no sides are equal).
Use an if-else statement to classify the triangle.
side1, side2, side3 ->
 */
public class TriangleClassifierEx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 side lengths of triangle");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a==b && b==c  && c==a)
        {
            System.out.println("All sides are equal");
        }else if(a==b || b==c || c==a)
        {
            System.out.println("two sides are equal");
        }else {
            System.out.println("No sides are equal");
        }
    }
}
