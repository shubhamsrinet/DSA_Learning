package dsa.array.easy;

import java.util.Scanner;

public class SingleNumberUsingXOR {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length here :");
        int length = sc.nextInt();
        int[] array = new int[length];
        System.out.println("Enter the array here :");
        for(int i =0 ;i<length;i++){
            array[i] = sc.nextInt();
        }
        System.out.println(singleNumberXOR(array));
    }

    private static int singleNumberXOR(int[] array) {
        int result =0;
        for(int i : array){
            result ^= i;
        }
        return result;
    }
}
