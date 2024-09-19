package dsa.array.easy;

import java.util.Scanner;

public class NeitherMinimumNorMaximum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length here :");
        int length = sc.nextInt();
        int[] array = new int[length];
        System.out.println("Enter the array here :");
        for(int i =0 ;i<length;i++){
            array[i] = sc.nextInt();
        }
        System.out.println(secondLargestElements(array));
    }

    private static int secondLargestElements(int[] array) {
        if(array.length<3){
            return -1;
        }
        //[3,2,1,5,6,4]
        int first =0;
        int second =0;
        for(int i : array){
            if(i>first){
                second = first;
                first = i;
            }else if(i< first && i > second){
                second = i;
            }
        }
        return second;
    }
}
