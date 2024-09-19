package dsa.array.easy;

import java.util.Arrays;
import java.util.Scanner;

public class FindMinimumValueInArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length here :");
        int length = sc.nextInt();
        int[] array = new int[length];
        System.out.println("Enter the array here :");
        for(int i =0 ;i<length;i++){
            array[i] = sc.nextInt();
        }
        System.out.println(returnMinimum(array));
    }

    private static int returnMinimum(int[] array) {

        int minimum =Integer.MAX_VALUE;
        for (int j : array) {
            if (j < minimum) {
                minimum = j;
            }
        }
        return minimum;
    }
}
