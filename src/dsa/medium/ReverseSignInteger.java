package dsa.medium;

import java.util.Scanner;

public class ReverseSignInteger {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here :");
        Integer x = sc.nextInt();
        System.out.println(reverseNumber(x));
    }

    private static int reverseNumber(Integer x) {
        int reverse = 0;

        if(x ==0){
            return 0;
        }
        while(x != 0){
            int pop = x % 10;
            x /= 10;
            if(reverse > Integer.MAX_VALUE / 10 || reverse < Integer.MIN_VALUE / 10){
                return 0;
            }
            reverse = reverse * 10 + pop;
        }

        return reverse;
    }
}
