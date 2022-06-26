package com.bridgelabz.bp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the expression:");
        String input = scan.nextLine();
        BP<String> bP = new BP<>(input);
        System.out.println(bP.checkP());
    }
}
