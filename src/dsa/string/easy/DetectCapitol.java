package dsa.string.easy;

public class DetectCapitol {
    public static void main(String[] args){
        String s = "AUuG";
        System.out.println(isCapitol(s));
    }

    private static boolean isCapitol(String s) {
        if(s.isEmpty()){
            return false;
        }
        if(s.charAt(0) >= 'A' && s.charAt(0) <= 'Z' && s.length() > 1){
            if(s.charAt(1) >= 'a' && s.charAt(1) <= 'z'){
                for(int i=1;i<s.length();i++){
                    if(!(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'))
                        return false;
                }
            }else if(s.charAt(1) >= 'A' && s.charAt(1) <= 'Z'){
                for(int i=1;i<s.length();i++){
                    if(!(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'))
                        return false;
                }
            }
        } else if(s.charAt(0) >= 'a' && s.charAt(0) <= 'z' && s.length() > 1) {
            for(int i=0;i<s.length();i++){
                if(!(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'))
                    return false;
            }
        }
        return true;
    }
}


//We define the usage of capitals in a word to be right when one of the following cases holds:
//
//All letters in this word are capitals, like "USA".
//All letters in this word are not capitals, like "leetcode".
//Only the first letter in this word is capital, like "Google".