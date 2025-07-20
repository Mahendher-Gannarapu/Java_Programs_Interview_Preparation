package Interview_PreparationApril2025.Coding_IQ.OldPrograms;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        int temp=n;
        int rem;
        int sum=0;

        while(n>0)
        {
            rem= n%10;
            sum= sum+(rem*rem*rem);
            n=n/10;
        }
       if(temp==sum)
           System.out.println("Given number is Armstrong");
       else
           System.out.println("Given number is not Armstrong");
    }
}
