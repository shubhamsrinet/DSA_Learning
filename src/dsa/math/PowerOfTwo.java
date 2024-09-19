package dsa.math;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length here :");
        int num = sc.nextInt();
        System.out.println(powerOfTwo(num));
    }

    private static boolean powerOfTwo(int num) {
        return num > 0 && (num & (num - 1)) == 0;
    }
}
