package dsa.math.medium;

public class UglyNumber2 {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(uglyNumber2(num));
    }

    private static int uglyNumber2(int n) {
        if(n==1){
            return 1;
        }
        int count=1;
        int number = 2;
        while(count<n){
            int num = number;
            while (num % 2 == 0) {
                num /= 2;
            }
            while (num % 3 == 0) {
                num /= 3;
            }
            while (num % 5 == 0) {
                num /= 5;
            }
            if(num == 1){
                count++;
            }
            number++;
        }
        return number-1;
    }
}
