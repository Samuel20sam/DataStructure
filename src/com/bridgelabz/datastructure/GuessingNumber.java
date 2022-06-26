package com.bridgelabz.datastructure;

import java.util.Scanner;

public class GuessingNumber {

    Integer[] list;
    Scanner scan = new Scanner(System.in);

    public void setRange(int range) {
        list = new Integer[range];
    }

    public void add(int key){
        list[key] = key;
    }

    public void playGame() {
        System.out.println("Assume the number within the range :");
        int max = 1000;
        int min = 0;
        int number = (max + min) / 2;
        showNumber(max, min, number);
    }

    private void showNumber(int max, int min, int number) {
        System.out.println(number);
        System.out.println("Enter your response " +
                " 1 for getting matched" +
                " 0 for getting a lower number" +
                " 2 for getting a higher number: ");
        int response = scan.nextInt();
        if (response == 1) {
            System.out.println("Number matched");
            return;
        }
        if (response == 0) {
            showNumber(max, number, (max + number) / 2);
        }
        if (response == 2) {
            showNumber(number, min, (number + min) / 2);
        }
    }
    public static void main(String[] args) {
        GuessingNumber game = new GuessingNumber();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the range of number you want me to guess :");
        int range = scan.nextInt();
        game.setRange(range);
        for (int i = 0; i < range; i++) {
            game.add(i);
        }
        game.playGame();
    }
}