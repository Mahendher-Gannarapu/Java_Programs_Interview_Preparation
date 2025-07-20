package Interview_PreparationApril2025.Coding_IQ.OldPrograms;

import java.util.Scanner;

public class ReverseWithDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        int rem;
        int reverse=0;

        while(n>0)
        {
            rem= n%10;
            reverse= (reverse*10)+rem;
            n=n/10;
        }
        System.out.println("Reverse value is= " +reverse);
    }
}
