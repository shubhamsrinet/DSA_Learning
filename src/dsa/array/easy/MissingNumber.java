package dsa.array.easy;

public class MissingNumber {
    public static void main(String[] args){
        System.out.println("Enter the array length here :");
        int[] array = {1,2};
        System.out.println(missingNumber(array));
    }

    private static int missingNumber(int[] array) {

        int length = array.length;
        int expected = length * (length+1)/2;
        int result =1;
        for (int j : array) {
            if (j != 0) {
                result *= j;
            }
        }
        return expected-result;
    }
}
