package com.company.Basics;

//Given a string, write a recursive function that checks if the given string is a palindrome, else, not a palindrome.
//
//        Examples:
//
//        Input : malayalam
//        Output : Yes
//        Reverse of malayalam is also
//        malayalam.
//
//        Input : max
//        Output : No
//        Reverse of max is not max.
//
//        The idea of a recursive function is simple:
//
//        1) If there is only one character in string
//        return true.
//        2) Else compare first and last characters
//        and recur for remaining substring.

public class Palindrome {

    // A recursive function that
    // check a str(s..e) is
    // palindrome or not.
    static boolean isPalRec(String str, int s, int e){

        // If there is only one character
        if (s == e)
            return true;

        // If first and last
        // characters do not match
        if ((str.charAt(s)) != (str.charAt(e)))
            return false;

        // If there are more than
        // two characters, check if
        // middle substring is also
        // palindrome or not.
        if (s < e + 1)
            return isPalRec(str, s + 1, e - 1);

        return true;
    }

    static boolean isPalindrome(String str){

        int n = str.length();

        // An empty string is
        // considered as palindrome
        if (n == 0)
            return true;

        return isPalRec(str, 0, n - 1);
    }

    // Driver Code
    public static void main(String args[])
    {
        String str = "geeg";

        if (isPalindrome(str))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
