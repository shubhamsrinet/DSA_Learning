package dsa.string.easy;

public class LengthofLastWord {

    public static void main(String[] args){
        String s1 = "leetcode is very good";
        System.out.println(findLength(s1));
    }

    private static int findLength(String s1) {
        if(s1.isEmpty()){
            return 0;
        }
        String[] array = s1.split(" ");
        return array[array.length-1].length();
    }

}


//Given a string s consisting of words and spaces, return the length of the last word in the string.
//A word is a maximal
//        substring
//consisting of non-space characters only.
//        Example 1:
//
//Input: s = "Hello World"
//Output: 5
//Explanation: The last word is "World" with length 5.
