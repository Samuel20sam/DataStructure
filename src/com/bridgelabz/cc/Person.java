package com.bridgelabz.cc;

public class Person {
    Person nextPerson;
    int money;
    int bankBalance = 1000;
    public Person( int money) {
        this.nextPerson = null;
        this.money = money;
        CashCounter.noOfCustomers++;
    }
}
