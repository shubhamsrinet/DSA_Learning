package dsa.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueEmailAddress {

    public static void main(String[] args){
        String[] strArray = new String[]{"test.email+alex@leetcode.com","test.email.leet+alex@code.com"};
        System.out.println(checkUniqueEmail(strArray));
    }

    private static int checkUniqueEmail(String[] strArray) {
        Set<String> set = new HashSet<>();
        for (String s : strArray) {
            StringBuilder sb = new StringBuilder();
            String[] parts = s.split("@");
            char[] charArray = parts[0].toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                if (charArray[i] != '.' && charArray[i] != '+') {
                    sb.append(charArray[i]);
                } else if (charArray[i] == '+') {
                    while (i < charArray.length) {
                        i++;
                    }
                }
            }
            sb.append('@');
            sb.append(parts[1]);
            set.add(sb.toString());
        }
        return set.size();
    }
}
