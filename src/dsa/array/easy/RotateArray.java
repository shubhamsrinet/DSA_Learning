package dsa.array.easy;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length here :");
        int length = sc.nextInt();
        int[] array = new int[length];
        System.out.println("Enter the array here :");
        for(int i =0 ;i<length;i++){
            array[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(Arrays.toString(rotateArray(array,k)));
    }

    private static int[] rotateArray(int[] array, int k) {
        int n = array.length;
        k = k % n;  // Normalize k
        if(array.length < k){
            return array;
        }

        int start = 0;
        int end = array.length-1;
        while(start < end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        int firstStart = 0;
        int firstEnd = k-1;
        while(firstStart < firstEnd){
            int temp = array[firstStart];
            array[firstStart] = array[firstEnd];
            array[firstEnd] = temp;
            firstStart++;
            firstEnd--;
        }
        int secondStart = k;
        int secondEnd = array.length-1;
        while(secondStart < secondEnd){
            int temp = array[secondStart];
            array[secondStart] = array[secondEnd];
            array[secondEnd] = temp;
            secondStart++;
            secondEnd--;
        }
        return array;
    }
}
