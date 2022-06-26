package com.bridgelabz.datastructure;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegEx {
    static String pattern = "^<{2}[a-z]{4}>{2}$";
    static Pattern patternObj = Pattern.compile(pattern);

    static String pattern1 = "^<{2}[a-z]{8}>{2}$";
    static Pattern patternObj1 = Pattern.compile(pattern1);

    static String pattern2 = "^91-x{10,}$";
    static Pattern patternObj2 = Pattern.compile(pattern2);

    public String stringMaker(String firstName, String fullname, String mobileNumber, String s) {
        String [] strArray = s.split(" ");
        for(int i = 0; i < strArray.length; i++) {
            if(strArray[i].matches(pattern)) {
                strArray[i] = firstName;
            }
            else if(strArray[i].matches(pattern1)){
                strArray[i] = fullname;
            }
            else if(strArray[i].matches(pattern2)) {
                strArray[i] = mobileNumber;
            }
        }
        return String.join(" ", strArray);
    }


    public static void main(String[] args) {
        RegEx expression = new RegEx();
        Scanner scan = new Scanner(System.in);

        String s = "Hello <<name>> , We have your full name as <<fullname>> in our system. " +
                "your contact number is 91-xxxxxxxxxx. " +
                "Please,let us know in case of any clarification.";

        System.out.println("Enter your first name :");
        String firstName = scan.nextLine();
        System.out.println("Enter your full name :");
        String fullName = scan.nextLine();
        System.out.println("Enter your mobile number :");
        String mobileNumber = scan.nextLine();
        System.out.println(expression.stringMaker(firstName, fullName, mobileNumber, s));

    }
}
