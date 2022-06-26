package com.bridgelabz.datastructure;

import java.util.Scanner;

public class Calender {

    public static void main(String[] a) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int yy = sc.nextInt();
        System.out.print("Enter month : ");
        int mm = sc.nextInt();

        Calender cal = new Calender();
        cal.calender(yy, mm);
    }

    public void calender(int yy, int mm) {
        int d = 1;
        int m = 1;
        int y = 1;
        int day = 1;

        // Storing data and months as input
        String[] days = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

        String[] month = { "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER",
                "OCTOBER", "NOVEMBER", "DECEMBER" };

        // Custom array as input
        int[] array = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        // Till condition holds true

        while (d != 1 || m != mm || y != yy) {
            if (y % 4 == 0 || y % 100 == 0) {
                array[1] = 29;
            } else {
                array[1] = 28;
            }
            day++;
            d++;
            if (d > array[m - 1]) {
                m++;
                d = 1;
            }
            if (m > 12) {
                m = 1;
                y++;
            }
            if (day == 7) {
                day = 0;
            }
        }
        if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
            array[1] = 29;
        } else {
            array[1] = 28;
        }

        // Print the desired month of input year
        System.out.println("MONTH:" + month[mm - 1]);
        for (int k = 0; k < 7; k++) {
            System.out.print("   " + days[k]);
        }
        System.out.println();
        for (int j = 1; j <= (array[mm - 1] + day); j++) {
            if (j > 6) {
                day = day % 6;
            }
        }
        int spaces = day;
        if (spaces == 0)
            spaces = 6;

        // Printing the calendar
        for (int i = 0; i < spaces; i++)
            System.out.print("      ");
        for (int i = 1; i <= array[mm - 1]; i++) {
            System.out.printf(" %4d ", i);
            if (((i + spaces) % 7 == 0) || (i == array[mm - 1]))
                System.out.println();
        }
    }
}