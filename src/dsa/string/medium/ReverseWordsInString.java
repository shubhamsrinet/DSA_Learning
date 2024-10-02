package dsa.string.medium;

import java.util.Arrays;
import java.util.Objects;

public class ReverseWordsInString {
    public static void main(String[] args){
        String s = "hi   hello how";
        System.out.println(reverseWord(s));
    }

    private static String reverseWord(String s) {
        String[] strArray = s.split(" ");
        StringBuilder sBuilder = new StringBuilder();
        for(int i= strArray.length-1;i>=0;i--){
            if(!Objects.equals(strArray[i], ""))
                sBuilder.append(strArray[i].trim()).append(" ");
        }
        s = sBuilder.toString();
        return s.trim();
    }
}
