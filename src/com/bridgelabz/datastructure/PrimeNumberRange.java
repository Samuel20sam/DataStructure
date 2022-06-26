package com.bridgelabz.datastructure;

public class PrimeNumberRange {
    public static void main(String[] args) {

        System.out.println("Prime number from 0 to 1000 is:");
        int start = 0;
        int stop = 1000;
        for(int i = start; i<=stop; i++) {
            if(isPrime(i))
                System.out.println(i);
        }
    }

    private static boolean isPrime(int number) {
        
        if(number < 2)
            return false;
        for (int i = 2; i<number; i++) {
            if(number % i == 0)
                return false;
        }
        return true;
    }
}
