package Interview_PreparationApril2025.Coding_IQ;

import java.util.Scanner;

public class First5EvenNumbers {
    public static void main(String[] args) {

        int n=2;
        int count=0;

        System.out.println("First 5 even numbers");
        do {
            System.out.println(n);
            n += 2;
            count++;
        } while (count < 5);

    }
}
