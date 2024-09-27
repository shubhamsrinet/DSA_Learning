package dsa.string.medium;

public class MultiplyStrings {
    public static void main(String[] args){
        String s1 = "9";
        String s2 = "99";
        System.out.println(multiply(s1,s2));
    }

    private static String multiply(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
        int[] result = new int[len1 + len2];

        for (int i = len1 - 1; i >= 0; i--) {
            for (int j = len2 - 1; j >= 0; j--) {
                int digit1 = num1.charAt(i) - '0';
                int digit2 = num2.charAt(j) - '0';
                int product = digit1 * digit2;
                int sum = product + result[i + j + 1];

                result[i + j + 1] = sum % 10;
                result[i + j] += sum / 10;
            }
        }

        StringBuilder resultString = new StringBuilder();
        for (int num : result) {
            if (!(resultString.isEmpty() && num == 0)) {
                resultString.append(num);
            }
        }

        return resultString.isEmpty() ? "0" : resultString.toString();
    }
}



//Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.
//Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.
//Example 1:
//Input: num1 = "2", num2 = "3"
//Output: "6"