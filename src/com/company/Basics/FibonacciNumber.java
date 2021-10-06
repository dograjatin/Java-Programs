package com.company.Basics;

public class FibonacciNumber {

    // This method is Exponential Time and Linear Space anc cant calculate values for higher values of N
    // Space - O(n) and Time = O(2^n)
    public static  int fibonacciRecursive(int n){
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }
        return ( fibonacciRecursive(n-1) + fibonacciRecursive(n-2) ) % 10;
    }

    // This method is Linear Time but still Linear Space and dont work with Higher Value since space limitation
    // Space - O(n) and Time = O(n)
    public static  int fibonacciIterative(int n){

        int[] f = new int[n +1];

        f[0] = 0;
        f[1] = 1;

        for(int i=2 ; i<=n ; i++){
            f[i] = (f[i-1] + f[i-2]) % 10;
        }

        return f[n];
    }

    // This method is Time and Space Optimized
    // Space - O(1) and Time = O(n)
    public static int fibonacciOptimized(int n){

        int a = 0 , b = 1, c = n;

        for( int i=2 ; i<=n ; i++){

            c =(a+b) % 10;
            a = b;
            b = c;
        }

        return c;

    }

    public static void main(String[] args){
        int n = 100;

        //System.out.print(fibonacciRecursive(n));
        //System.out.print(fibonacciIterative(n));
        System.out.println(fibonacciOptimized(n));
    }
}
