package Interview_PreparationApril2025.Coding_IQ.OldPrograms;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        int rem;
        int sum=0;

        while(n>0)
        {
            rem= n%10;
            sum= sum+rem;
            n=n/10;
        }
        System.out.println("SumOfDigit value is= " +sum);
    }
}
