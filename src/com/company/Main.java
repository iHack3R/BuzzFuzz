package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int userData = input.nextInt();
        int valueOne = 3;
        int valueTwo = 5;
        if (userData/valueTwo) {
            System.out.println("Fizz");
        } else if (userData/valueOne) {
            System.out.println("Buzz");
        } else if (userData/valueOne && userData/valueTwo) {
            System.out.println("FizzBuzz");
        }
        else {
            System.out.println(userData);
        }
    }
}
