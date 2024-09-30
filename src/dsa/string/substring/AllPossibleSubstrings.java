package dsa.string.substring;

import java.util.ArrayList;
import java.util.List;

public class AllPossibleSubstrings {
    public static void main(String[] args){
        String s = "duggu";
        System.out.println(allSubstrings(s));

    }

    private static List<String> allSubstrings(String s) {
        List<String> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                list.add(s.substring(i,j));
            }
        }
        return list;
    }
}

//O(n3)
