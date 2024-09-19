package dsa.array.easy;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length here :");
        int length = sc.nextInt();
        int[] array = new int[length];
        System.out.println("Enter the array here :");
        for(int i =0 ;i<length;i++){
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(moveZeros(array)));
    }

    private static int[] moveZeros(int[] array) {
        //[0,1,0,3,12]
        int nonZeroIndex =0;
        for(int i=0;i<array.length;i++){
            if (array[i]!= 0) {
               if(i != nonZeroIndex){
                   int temp = array[i];
                   array[i] = array[nonZeroIndex];
                   array[nonZeroIndex] = temp;
               }
               nonZeroIndex++;
            }
        }
        return array;
    }
}
