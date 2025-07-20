package Interview_PreparationApril2025.Coding_IQ;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter marks");
        int marks= s.nextInt();

        if(marks>=90 && marks <=100)
            System.out.println("Grade A");
                else if(marks>=80 && marks <=89)
                    System.out.println("Grade B");
                        else if(marks>=70 && marks <=79)
                            System.out.println("Grade C");
                                else if(marks>=60 && marks <=69)
                                    System.out.println("Grade D");
                                         else if(marks>=0 && marks <=59)
                                             System.out.println("Grade F");
                                         else
            System.out.println("Invalid entry");
    }
}
