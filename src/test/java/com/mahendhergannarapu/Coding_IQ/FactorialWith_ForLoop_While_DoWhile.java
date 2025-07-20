package Interview_PreparationApril2025.Coding_IQ;

import java.util.Scanner;

public class FactorialWith_ForLoop_While_DoWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = s.nextInt();
        int f=1;
        int f1=1;
        int f2=1;
        //With For Loop
        for(int i=1;i<=n; i++)
        {
            f=f*i;
        }
        System.out.println("Factorial using For Loop=" +f);

        //With while loop
        int i=1;
        while(i<=n)
        {
            f1=f1*i;
            i++;
        }
        System.out.println("Factorial using while Loop=" +f1);

        //With do-while loop
        i=1;
        do {
                f2=f2*i;
                i++;
        }
        while(i<=n);
        System.out.println("Factorial using do-while Loop=" +f2);
    }
}
