package dsa.array.easy;

import java.util.Scanner;


public class FindSecondMin {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length here :");
        int length = sc.nextInt();
        int[] array = new int[length];
        System.out.println("Enter the array here :");
        for(int i =0 ;i<length;i++){
            array[i] = sc.nextInt();
        }
        System.out.println(returnSecondMinimum(array));
    }

    private static int returnSecondMinimum(int[] array) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        //array --> 3,6,7,1,2
        for(int i : array){
            if(i < first){
                second = first;
                first = i;
            }
            else if(i > first && i < second){
                second = i;
            }
        }
        return second;
    }
}
