package Interview_PreparationApril2025.Coding_IQ;

import java.util.Scanner;

public class StringPalindromeIMP {
    public static void main(String[] args) {

//        String str = "madam"; // Example string
//        String reverse = "";
        System.out.println("Enter a String");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String reverse = "";

        // Loop to reverse the string
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        /*        for (int i=str.length()-1;i>=0;i--) {
            reverse = reverse + str.charAt(i);
        }
*/

        // Check if original string and reversed string are same
        if (str.equals(reverse)) {
            System.out.println(str + " is a Palindrome.");
        } else {
            System.out.println(str + " is NOT a Palindrome.");
        }
    }
}
