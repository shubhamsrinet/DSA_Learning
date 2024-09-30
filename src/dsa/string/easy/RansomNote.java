package dsa.string.easy;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public static void main(String[] args){
        String ransomNote = "a";
        String magazine = "b";
        System.out.println(isRansom(ransomNote,magazine));
    }

    private static boolean isRansom(String ransomNote, String magazine) {

        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            if(!map.containsKey(magazine.charAt(i))){
                map.put(magazine.charAt(i),1);
            }else {
                map.put(magazine.charAt(i), map.get(magazine.charAt(i))+1);
            }
        }
        for(int i=0;i<ransomNote.length();i++){
            if(map.containsKey(ransomNote.charAt(i))){
                int num = map.get(ransomNote.charAt(i));
                if(num <= 0){
                    return false;
                }
                map.put(ransomNote.charAt(i),map.get(ransomNote.charAt(i))-1);
            }else return false;
        }
        return true;
    }
}


//Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
//
//Each letter in magazine can only be used once in ransomNote.

//Example 1:
//
//Input: ransomNote = "aa", magazine = "aab"
//Output: true