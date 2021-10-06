//package com.company.Basics;
//
//import java.util.Scanner;
//import java.lang.Math;
//
//public class PrimeNumber2 {
//
//    public static void main(String args[]) {
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        System.out.println(checkPrime(n));
//    }
//
//    private static boolean checkPrime(int n) {
//
//        if(n<=1){
//            return false;
//        }
//
//        else if (n<=3){
//            return true;
//        }
//
//        else if(n%2 == 0 || n%3 == 0){
//            return false;
//        }
//
//        else{
//            if(int i=5 ; i< Math.sqrt(n); i +=6 ){
//                if(n%i == 0 || n% (i+2) == 0){
//                    return false;
//                }
//            }
//        }
//
//        return true;
//
//
//    }
//}
