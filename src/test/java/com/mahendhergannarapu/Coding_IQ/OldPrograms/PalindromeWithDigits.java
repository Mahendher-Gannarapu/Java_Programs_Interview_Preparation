package Interview_PreparationApril2025.Coding_IQ.OldPrograms;

import java.util.Scanner;

public class PalindromeWithDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        int temp=n;
        int rem;
        int reverse=0;

        while(n>0)
        {
            rem= n%10;
            reverse = (reverse*10)+rem;
            n= n/10;
        }
       if(temp==reverse)
           System.out.println("Its palindrame");
       else
           System.out.println("Its not Palindrome");
    }
}
