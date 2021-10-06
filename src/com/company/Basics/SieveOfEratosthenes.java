package com.company.Basics;

//Print all primes less than or equal to n
//    Description
//    You will be given an integer n. You need to print all the prime numbers that are less than or equal to n in the ascending order.
//
//    Input: The input will be in the following format:
//    The first line should be the value of n.
//
//
//    Output: The output should be in the following format
//    In the first line, print all the prime numbers that are less than or equal to n in the ascending order and separate them by spaces.
//
//    Note: If there is no prime number less than or equal to n, then print ‘There are no prime numbers less than or equal to n'

import java.util.Scanner;

public class SieveOfEratosthenes {

    static void primesLessThanOrEqualTon(int n) {

        if (n > 1) {

            // Create a List of Consecutive Numbers from 2 to N
            boolean numList[] = new boolean[n + 1];

            //Mark all of them true as prime numbers
            for (int i = 0; i <= n; i++) {
                numList[i] = true;
            }

            //Now we will eliminate the numbers which are not prime
            //start from 2 and check every element for being prime
            for (int p = 2; p <= n; p++) {
                // If prime[p] is not changed and still true, then it is a prime
                if (numList[p] == true) {
                    // Update all multiples of p as not primes and eliminate them by marking false
                    for (int i = 2 * p; i <= n; i += p)
                        numList[i] = false;
                }
            }

            // all the elements which are still left true as prime are the prime numbers
            // we can print the list of prime numbers now
            for (int i = 2; i <= n; i++) {
                if (numList[i] == true)
                    System.out.print(i + " ");
            }
        } else {
            System.out.println("There are no prime numbers less than or equal to " + n);
        }
    }

    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        primesLessThanOrEqualTon(n);
    }
}
