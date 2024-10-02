package dsa.math;

import java.util.Scanner;

public class UglyNumber {
    public static void main(String[] args) {
        int num = 14;
        System.out.println(uglyNumber(num));
    }

    private static boolean uglyNumber(int num) {
        while (num % 2 == 0) {
            num /= 2;
        }
        while (num % 3 == 0) {
            num /= 3;
        }
        while (num % 5 == 0) {
            num /= 5;
        }
        return num == 1;
    }
}

//An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
//
//Given an integer n, return true if n is an ugly number.
//Example
//Input: n = 6
//Output: true
//Explanation: 6 = 2 × 3
