package dsa.string.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepeatedDNASequences {
    public static void main(String[] args){
        String s = "AAAAAAAAAAA";
        System.out.println(repeatedDNASequences(s));
    }

    private static List<String> repeatedDNASequences(String s) {
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<=s.length()-10;i++){
            String str = s.substring(i,i+10);
            if(!map.containsKey(str)){
                map.put(str,1);
            }else {
                map.put(str,map.get(str)+1);
            }
        }

        List<String> list = new ArrayList<>();
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            if(entry.getValue()>1){
                list.add(entry.getKey());
            }
        }
        return list;
    }
}
