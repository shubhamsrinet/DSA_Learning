package dsa.array.easy;

import java.util.*;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length here :");
        int length = sc.nextInt();
        int[] array = new int[length];
        System.out.println("Enter the array here :");
        for(int i =0 ;i<length;i++){
            array[i] = sc.nextInt();
        }
        System.out.println(removeDuplicates(array));
    }

    private static int removeDuplicates(int[] array) {
        int newVal = array[0];
        int newIndex =1;
        for(int i = 1;i<array.length;i++){
            if(array[i]>newVal){
                array[newIndex++] = array[i];
                newVal = array[i];
            }
        }
        return newIndex;
    }
}
