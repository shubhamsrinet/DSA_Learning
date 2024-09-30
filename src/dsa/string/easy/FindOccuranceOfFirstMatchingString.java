package dsa.string.easy;

import java.util.HashMap;
import java.util.Map;

public class FindOccuranceOfFirstMatchingString {
    public static void main(String[] args){
        String s1 = "leetcodez";
        String s2 = "z";
        System.out.println(findOcc(s1,s2));
    }

    private static int findOcc(String s1, String s2) {
        Map<String,Integer> map = new HashMap<>();
        int start =0;
        int end = s2.length();
        for(int i =0;i<s1.length()-s2.length()+1;i++){
            String save = s1.substring(start,end);
            map.put(save,i);
            if(map.containsKey(s2)){
                return map.get(s2);
            }
            start++;
            end++;
        }
        return -1;
    }
}



