package dsa.math;

import java.util.Scanner;

public class PowerOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length here :");
        int num = sc.nextInt();
        System.out.println(powerOfThree(num));
    }

    private static boolean powerOfThree(int num) {
        if(num<=0)return false;
        return 1162261467 % num == 0;
    }
}
