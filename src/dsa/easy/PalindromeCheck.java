package dsa.easy;

import java.util.Scanner;

public class PalindromeCheck {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here :");
        Integer x = sc.nextInt();
        System.out.println(checkPalindrome(x));
    }

    private static boolean checkPalindrome(Integer x) {
        if(x < 0 || (x % 10 == 0 && x!=0)){
            return false;
        }

        int reverse = 0;
        while(x > reverse){
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x /= 10;
        }
        return x == reverse || x == reverse / 10;
    }
}
