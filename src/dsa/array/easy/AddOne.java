package dsa.array.easy;

import java.util.Arrays;
import java.util.Scanner;

public class AddOne {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length here :");
        int length = sc.nextInt();
        int[] array = new int[length];
        System.out.println("Enter the array here :");
        for(int i =0 ;i<length;i++){
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(addOne(array)));
    }

    private static int[] addOne(int[] array) {
        for(int i =array.length-1 ; i>=0 ; i--){
            if(array[i] < 9){
                array[i]++;
                return  array;
            }
                array[i] = 0;
        }

        int[] newArray = new int[array.length+1];
        newArray[0] = 1;
        return newArray;
    }
}
