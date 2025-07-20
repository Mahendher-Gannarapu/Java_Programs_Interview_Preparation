package Interview_PreparationApril2025.Coding_IQ;

import java.util.Scanner;

public class MathTableWithLoops {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = s.nextInt();
        int i=1;

//        for(int i=1;i<=10;i++)
//        {
//            System.out.println(n+"*"+i+"="+n*i);
//        }

        while(i<=10)
        {
            System.out.println(n+"*"+i+"="+n*i);
            i++;
        }
    }
}
