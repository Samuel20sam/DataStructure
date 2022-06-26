package com.bridgelabz.datastructure;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Word");
        String str1 = sc.next();
        System.out.println("Enter the second Word");
        String str2 = sc.next();

        //lower case
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        //check length
        if (str1.length() == str2.length()) {

            //convert string into char array
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();
            System.out.println("1. " + Arrays.toString(charArray1) +"2. " + Arrays.toString(charArray2));
            //if sorted array is same string is anagram
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            System.out.println("1. " + Arrays.toString(charArray1) +"2. " + Arrays.toString(charArray2));
            boolean result = Arrays.equals(charArray1, charArray2);

            if (result) {
                System.out.println(str1 + " and " + str2 + " are anagram");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagram");
            }
        } else {
            System.out.println("Length is not equal");
        }
    }
}