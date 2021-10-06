package com.company.Basics;

//Recursion
//    Description
//    Write a Java program to calculate the sum of n consecutive natural numbers.
//    For example: if input = 3, then the sum = 3 + 2 + 1 = 6, so output = 6
//
//    Sample input
//    3
//    Sample Output
//    6
//
//    Sample input
//    1
//    Sample Output
//    1

import java.util.Scanner;

public class SumOfConsecutiveNumbers {

    public static int SumOfN(int n){
        if (n<2){
            return n;
        }

        return n + SumOfN(n-1) ;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        if(n>0){
            int sum = SumOfN(n);
            System.out.println("Sum of first "+ n + " numbers is: " + sum);
        }
    }
}
