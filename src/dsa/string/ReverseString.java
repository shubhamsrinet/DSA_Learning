package dsa.string;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length here :");
        int length = sc.nextInt();
        char[] array = new char[length];
        System.out.println("Enter the array here :");
        for(int i =0 ;i<length;i++){
            array[i] = sc.next().charAt(0);
        }
        System.out.println(reverseString(array));
    }

    private static char[] reverseString(char[] array) {
        int first = 0;
        int last = array.length-1;
        char temp;
        for(int i=0;i<array.length;i++){
            while(first<last){
                temp = array[first];
                array[first] = array[last];
                array[last] = temp;
                first++;
                last--;
            }
        }
        return array;
    }
}
