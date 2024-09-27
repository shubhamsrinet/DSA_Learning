package dsa.string.easy;

import java.util.Stack;

public class BalanceParanthesis {
    public static void main(String[] args){
        String s = "[({{}})]";
        System.out.println(isValid(s));
    }

    private static boolean isValid(String s) {
        if(s.isEmpty() || s.length() == 1)
            return false;
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                stack.push(s.charAt(i));
            }else{
                    if(!stack.isEmpty()){
                        char c = stack.pop();
                        if(c == '(' && s.charAt(i) != ')' || c == '[' && s.charAt(i) != ']' || c == '{' && s.charAt(i) != '}')
                            return false;
                    }else return false;
                }
            }
        return stack.isEmpty();
        }
}
