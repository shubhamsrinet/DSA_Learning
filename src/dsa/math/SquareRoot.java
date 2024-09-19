package dsa.math;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length here :");
        int num = sc.nextInt();
        System.out.println(sqrRoot(num));
    }

    private static int sqrRoot(int num) {
        return (int) Math.sqrt(num);
    }
}
