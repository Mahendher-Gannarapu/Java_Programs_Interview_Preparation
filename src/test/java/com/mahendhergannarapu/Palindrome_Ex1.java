package com.mahendhergannarapu;

public class Palindrome_Ex1 {
    public static void main(String[] args) {

        String str1 = "Madam";
        String str= str1.toLowerCase();
        StringBuilder result = new StringBuilder(str).reverse();
        System.out.println(result);

        if(str.equals(result.toString()))
        {
            System.out.println("String is polindrome");
        }
        else
        {
            System.out.println("String not Polindrome");
        }
    }

}