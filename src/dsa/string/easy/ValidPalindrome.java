package dsa.string.easy;

public class ValidPalindrome {

    public static void main(String[] args){
        String s = "abba";
        System.out.println(isPalindrome(s));
        isPalindrome(s);
    }

    private static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                sb.append((char)(s.charAt(i)+32));
            }else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                sb.append(s.charAt(i));
            }
        }
        s = sb.toString();
        int start =0;
        int end = s.length()-1;
        while (start < end){
            if(s.charAt(start) == s.charAt(end)){
                start++;
                end--;
            }else return false;
        }
        return true;
    }
}


//A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
// it reads the same forward and backward. Alphanumeric characters include letters and numbers.
//Given a string s, return true if it is a palindrome, or false otherwise.
//        Example 1:
//Input: s = "A man, a plan, a canal: Panama"
//Output: true
//Explanation: "amanaplanacanalpanama" is a palindrome.
