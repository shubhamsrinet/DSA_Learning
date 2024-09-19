package dsa.array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DuplicateZeros {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length here :");
        int length = sc.nextInt();
        int[] array = new int[length];
        System.out.println("Enter the array here :");
        for(int i =0 ;i<length;i++){
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(duplicateZero(array)));
    }

    private static int[] duplicateZero(int[] array) {

        int newArrayIndex = 0;
        int[] newArray = new int[array.length];
        int i=0;

        //1,0,2,3,0,4,5,0
            while(array.length > newArrayIndex){
                if(array[i]>0){
                    newArray[newArrayIndex++] = array[i];
                }else{
                    newArray[newArrayIndex++] = 0;
                    if (array.length > newArrayIndex){
                        newArray[newArrayIndex++] = 0;
                    }
                }
                i++;
            }
            return newArray;
    }
}
