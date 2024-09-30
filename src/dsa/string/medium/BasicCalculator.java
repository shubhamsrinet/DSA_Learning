package dsa.string.medium;

import java.util.Stack;

public class BasicCalculator {
    public static void main(String[] args){
        String s = "3+5/2";
        System.out.println(basicCalculator(s));
    }

    private static int basicCalculator(String expression) {
        Stack<Integer> valueStack = new Stack<>();
        int currentNumber = 0;
        char currentOperator = '+';
        int expressionLength = expression.length();

        for (int i = 0; i < expressionLength; i++) {
            char currentChar = expression.charAt(i);

            if (Character.isDigit(currentChar)) {
                currentNumber = currentNumber * 10 + (currentChar - '0');
            }

            if (!Character.isDigit(currentChar) && !Character.isWhitespace(currentChar) || i == expressionLength - 1) {
                if (currentOperator == '+') {
                    valueStack.push(currentNumber);
                } else if (currentOperator == '-') {
                    valueStack.push(-currentNumber);
                } else if (currentOperator == '*') {
                    valueStack.push(valueStack.pop() * currentNumber);
                } else if (currentOperator == '/') {
                    valueStack.push(valueStack.pop() / currentNumber);
                }
                currentOperator = currentChar;
                currentNumber = 0;
            }
        }

        int result = 0;
        while (!valueStack.isEmpty()) {
            result += valueStack.pop();
        }

        return result;
    }
}
