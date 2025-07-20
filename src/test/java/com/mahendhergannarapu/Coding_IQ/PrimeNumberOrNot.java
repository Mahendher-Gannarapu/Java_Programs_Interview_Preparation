package Interview_PreparationApril2025.Coding_IQ;

import java.util.Scanner;

public class PrimeNumberOrNot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int count = 0;

        //Prime number divisible by one and itself
        for(int i=1;i<=n;i++) {
            while(n % i == 0) {
                count++;
                i++;
            }
        }

        if(count==2) {
            System.out.println("prime number");
        }
        else {
            System.out.println("Not Prime number");
        }
    }
}
