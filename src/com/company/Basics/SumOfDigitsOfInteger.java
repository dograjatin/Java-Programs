package com.company.Basics;

//Description
//        Write a Java program to calculate the sum of the digits of a given number.
//
//        Example:
//        Number: 492; then, the output is 4 + 9 + 2 = 15
//        The input accepts the number whose sum of digits needs to be evaluated, and the output prints the value of the sum./
//
//        Sample input - 1
//        492
//
//        Sample output -
//        15
//
//        Sample input - 2
//        42
//
//        Sample output - 2
//        6

import java.util.Scanner;

public class SumOfDigitsOfInteger {

    public static int sumRecursive(int n) {

        //write the logic here

        if(n == 0){
            return 0;
        }
        int lastDigit = n % 10;
        return lastDigit + sumRecursive(n/10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int num = sc.nextInt();
        System.out.println("Sum of the digits of " + num + " is " + sumRecursive(num));
    }

}
