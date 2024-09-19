package dsa.math;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumProductOfThreeNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length here :");
        int length = sc.nextInt();
        int[] array = new int[length];
        System.out.println("Enter the array here :");
        for(int i =0 ;i<length;i++){
            array[i] = sc.nextInt();
        }
        System.out.println(maximumProduct(array));
    }

    private static int maximumProduct(int[] array) {
        if(array.length < 3)
            return 0;
        Arrays.sort(array);
        int a = array[0]*array[1]*array[array.length-1];
        int b = array[array.length-1]*array[array.length-2]*array[array.length-3];
        return Math.max(a, b);
    }
}
