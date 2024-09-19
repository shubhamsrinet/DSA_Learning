package dsa.array.easy;

import java.util.Scanner;

public class SearchInsertPosition {
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
        System.out.println(searchInsertPosition(array,target));
    }

    //Input: nums = [1,3,5,6], target = 5
    private static int searchInsertPosition(int[] array,int target) {
        for(int i=0;i<array.length;i++){
            if(target <= array[i]){
                return i;
            }
        }
        return array.length;
    }
}
