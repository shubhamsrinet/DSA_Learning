package dsa.math;

import java.util.Scanner;

public class AddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length here :");
        int num = sc.nextInt();
        System.out.println(addDigits(num));
    }

    private static int addDigits(int num) {
        if(num < 9){
            return num;
        }else{
            while(num >= 10){
                num = returnAddition(num);
            }
        }
        return num;
    }

    static int returnAddition(int num){
        int reminder=0;
        while (num >0){
            reminder = reminder + num%10;
            num=num/10;
        }
        return reminder;
    }
}
