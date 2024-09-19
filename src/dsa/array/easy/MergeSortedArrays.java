package dsa.array.easy;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first array length here :");
        int length1 = sc.nextInt();
        int[] array1 = new int[length1];
        System.out.println("Enter the first array here :");
        for(int i =0 ;i<length1;i++){
            array1[i] = sc.nextInt();
        }
        System.out.println("Enter the first array length here :");
        int length2 = sc.nextInt();
        int[] array2 = new int[length2];
        System.out.println("Enter the second array here :");
        for(int i =0 ;i<length2;i++){
            array2[i] = sc.nextInt();
        }

        int targetlen1 = sc.nextInt();
        int targetlen2 = sc.nextInt();

        System.out.println(Arrays.toString(mergedArray(array1, targetlen1, array2, targetlen2)));
    }

    private static int[] mergedArray(int[] array1, int length1, int[] array2, int length2) {
        int[] newArray = new int[length1+length2];
        int i=0;
        int j=0;
        int k=0;

        while(i<length1 || j<length2){
            if(array1[i]<=array2[j]){
                newArray[k++]=array1[i++];
            }else{
                newArray[k++]=array2[j++];
            }
        }

        while(i<length1){
            newArray[k++]=array1[i++];
        }

        while(j<length2){
            newArray[k++]=array2[j++];
        }

        return newArray;
    }
}
