package Interview_PreparationApril2025.Coding_IQ;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TakeInPutFromScannerClass {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a name");
        String name = s.nextLine();
        System.out.println("Enter age");
        int age = s.nextInt();

        System.out.println("Hi" +name+ "your age is="+age);
    }
}
