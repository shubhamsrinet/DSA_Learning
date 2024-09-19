package dsa.array.easy;

import java.util.Arrays;
import java.util.Scanner;

public class PairofTargetSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length here :");
        int length = sc.nextInt();
        int[] array = new int[length];
        System.out.println("Enter the array here :");
        for(int i =0 ;i<length;i++){
            array[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(Arrays.toString(pairOfTargetSum(array, target)));
    }

    private static int[] pairOfTargetSum(int[] array, int target) {

        int left = 0;
        int right =array.length-1;
        int[] returnArray = new int[2];

        while(left < right){
            if(array[left]+array[right]==target){
                returnArray[0] = array[left];
                returnArray[1] = array[right];
                left++;
                right--;
            }else if(array[left]+array[right] < target){
                left++;
            }else {
                right--;
            }

        }
        return returnArray;
    }
}
