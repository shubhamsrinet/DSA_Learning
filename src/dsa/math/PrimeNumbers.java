package dsa.math;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length here :");
        int num = sc.nextInt();
        System.out.println(primeNumbers(num));
    }

    private static int primeNumbers(int num) {
        if(num == 0 || num == 1) {
            return 0;
        }
        Boolean[] isPrime = new Boolean[num+1];

        for(int i=2;i<=num;i++){
            isPrime[i] = true;
        }
        for(int p=2;p*p<=num;p++){
            if (isPrime[p]) {
                for (int i = p * p; i <= num; i = i + p) {
                    isPrime[i] = false;
                }
            }

        }
        int count =0;
        for(int i =2;i<isPrime.length-1;i++){
            if(isPrime[i]){
                count++;
            }
        }
        return count;
    }
}