package Interview_PreparationApril2025.Coding_IQ;

import java.util.Scanner;

public class StringReverseIMP {
    public static void main(String[] args) {

        System.out.println("Enter a String");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String reverse =" ";

        for (int i=str.length()-1;i>=0;i--)
        {
            reverse=reverse+str.charAt(i);
        }

        System.out.println(str +" is a original string");
        System.out.println(reverse +" is a reverse string");
    }
}
