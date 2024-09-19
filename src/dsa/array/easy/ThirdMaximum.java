package dsa.array.easy;

import java.util.Arrays;
import java.util.Scanner;

public class ThirdMaximum {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length here :");
        int length = sc.nextInt();
        int[] array = new int[length];
        System.out.println("Enter the array here :");
        for(int i =0 ;i<length;i++){
            array[i] = sc.nextInt();
        }
        System.out.println(thirdLargestElements(array));
    }

        private static int thirdLargestElements(int[] array) {
        int first = 0, second = 0 , third = 0;
        //num = [2,2,3,1]
        for (int j : array) {
            if(j == first || j == second || j == third) {
                continue;
            }
            if (j > first) {
                third = second;
                second = first;
                first = j;
            } else if (j > second) {
                third = second;
                second = j;
            } else if (j > third) {
                third = j;
            }
        }
        return third == 0 ? first : third;
    }
}
