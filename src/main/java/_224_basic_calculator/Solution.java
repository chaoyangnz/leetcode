
package _224_basic_calculator;

import java.util.Stack;

/**
 * https://leetcode.com/problems/basic-calculator
 */
public class Solution {
    private final Stack<Integer> operandStack = new Stack<Integer>();
    private final Stack<Character> operatorStack = new Stack<Character>();

    private final StringBuilder operandBuilder = new StringBuilder();

    public int calculate(String s) {
        char[] chars = s.toCharArray();
        for(char ch : chars) {
            if(ch == ' ') continue;
            else if(ch == '(') operatorStack.push('(');
            else if(ch == ')') {
                handleOperand();
                boolean leftBracketFound = false;
                while (!operatorStack.empty()) {
                    char op = operatorStack.peek();
                    if(op != '(') {
                        calculate();
                    } else {
                        leftBracketFound = true;
                        operatorStack.pop(); // pop (
                        break;
                    }
                }
                if(!leftBracketFound) throw new IllegalArgumentException("No matched left bracket");
            }
            else if(Character.isDigit(ch)) {
                operandBuilder.append(ch);
            }
            else if(ch == '+' || ch == '-') {
                handleOperand();
                while (!operatorStack.empty()) {
                    char op = operatorStack.peek();
                    if(op != '(') {
                        calculate();
                    } else {
                        break;
                    }
                }
                operatorStack.push(ch);
            }
            else throw new IllegalArgumentException(String.format("Unsupported symbols: %s", ch));
        }

        handleOperand();
        while (!operatorStack.empty()) {
            calculate();
        }

        return operandStack.pop();
    }

    private void handleOperand() {
        if(operandBuilder.length() != 0) {
            if(operandBuilder.charAt(0) == '0' && operandBuilder.length() > 1) {
                throw new IllegalArgumentException(String.format("Illegal number format: %s", operandBuilder));
            }
            operandStack.push(Integer.parseInt(operandBuilder.toString())); // can verify int
            operandBuilder.setLength(0);
        }
    }

    private void calculate() {
        char operator = operatorStack.pop();
        int operand2 = operandStack.pop();
        int operand1 = operandStack.pop();
        if(operator == '+') operandStack.push(operand1 + operand2);
        else if(operator == '-') operandStack.push(operand1 - operand2);

        else throw new IllegalArgumentException(String.format("Unsupported operator: %s", operator));
    }
}
