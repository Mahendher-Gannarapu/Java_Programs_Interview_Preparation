package Interview_PreparationApril2025.Coding_IQ;

import java.util.Scanner;

/*
Count vowels and consonants in a String. (pramod) - v = 5 , c =. 4
 */
public class CountVowelsEx {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a String");
        String input = s.nextLine();
        System.out.println("Entered string is ="+input);

        input= input.toLowerCase();
        int vowelCount=0;
        int consonantCount=0;

        for(int i=0;i<input.length();i++)
        {
            //System.out.println(i);
            char ch = input.charAt(i);

            if(ch>='a' && ch<='z')
            {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
                    System.out.println(ch+ "It is a vowel");
            } else {
                consonantCount++;
                    System.out.println(ch+ "It is a consonent");
            }
            }

        }

        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);


    }
}
