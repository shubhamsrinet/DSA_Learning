package dsa.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToNumber {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here :");
        String str = sc.nextLine();
        System.out.println(romanToInt(str));
    }

    public static int romanToInt(String s) {

        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I',1);
        romanMap.put('V',5);
        romanMap.put('X',10);
        romanMap.put('L',50);
        romanMap.put('C',100);
        romanMap.put('D',500);
        romanMap.put('M',1000);

        int result =0;
        //XII
        for(int i=0;i<s.length();i++){
            int current = romanMap.get(s.charAt(i));
            if(i + 1 < s.length() && romanMap.get(s.charAt(i+1)) > current){
                result -= current;
            }else{
                result += current;
            }
        }
        return result;
    }
}
