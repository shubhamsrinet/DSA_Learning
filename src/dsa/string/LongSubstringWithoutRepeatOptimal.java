package dsa.string;

import java.util.HashMap;
import java.util.Map;

public class LongSubstringWithoutRepeatOptimal {
    public static void main(String[] args){
        String s = "adbcab";
        System.out.println(longestSubstring(s));

    }

    private static int longestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        Map<Character,Integer> map = new HashMap<>();
        int l =0;
        int len = 0;
        for(int r=0;r<s.length();r++){
            if(map.containsKey(s.charAt(r))){
                l = Math.max(l,map.get(s.charAt(r))+1);
            }
            map.put(s.charAt(r),r);
            len = Math.max(len,r-l+1);
        }
           return len;
    }
}
