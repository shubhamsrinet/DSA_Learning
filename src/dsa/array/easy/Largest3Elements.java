package dsa.array.easy;

import java.util.Arrays;
import java.util.Scanner;

public class Largest3Elements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length here :");
        int length = sc.nextInt();
        int[] array = new int[length];
        System.out.println("Enter the array here :");
        for(int i =0 ;i<length;i++){
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(largest3Elements(array)));
    }

    private static int[] largest3Elements(int[] array) {
        int first = 0, second = 0 , third = 0;

        for (int j : array) {
            if (j > first) {
                third = second;
                second = first;
                first = j;
            } else if (j < first && j > second) {
                third = second;
                second = j;
            } else if (j < first && j < second && j > third) {
                third = j;
            }
        }
        System.out.println(first+" "+second+" "+third);
        return array;
    }
}
