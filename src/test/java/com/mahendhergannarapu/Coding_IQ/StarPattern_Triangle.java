package Interview_PreparationApril2025.Coding_IQ;

import java.util.Scanner;

public class StarPattern_Triangle {
    public static void main(String[] args) {

        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>i;j--)
            {
                System.out.print(" ");
            }

            // Print stars or numbers
            for (int k = 1; k <= (2 * i - 1); k++)
            {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }


    }
}
