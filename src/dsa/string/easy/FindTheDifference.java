package dsa.string.easy;

import java.util.HashMap;
import java.util.Map;

public class FindTheDifference {
    public static void main(String[] args){
        String s = "a";
        String t = "aa";
        System.out.println(findTheDifference(s,t));
    }

    private static char findTheDifference(String s, String t) {
        Map<Character,Integer> map = new HashMap<>();
        for(Character c : s.toCharArray()){
            if(!map.containsKey(c)){
                map.put(c,1);
            }else {
                map.put(c,map.get(c)+1);
            }
        }
        for(Character c : t.toCharArray()) {
            if(map.containsKey(c) && map.get(c) == 0){
                return c;
            }
            if (!map.containsKey(c)) {
                return c;
            }else {
                map.put(c,map.get(c)-1);
            }
        }
        return 0;
    }
}
