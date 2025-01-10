package tech.lpdev;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Teaching {

    public static void main(String[] args) {
        String equation = "8^2";
        List<String> tokens = lexer(equation);
        System.out.println(tokens);
        double result = evaluate(tokens);
        System.out.println(result);
    }

    private static List<String> lexer(String equation) {
        List<String> tokens = new ArrayList<>();
        StringBuilder number = new StringBuilder();
        for (char c : equation.toCharArray()) {
            if (c == ' ') continue;
            if (c >= '0' && c <= '9') number.append(c);
            else if ( c == '+' || c == '-' || c == '*' || c == '/' || c == '^' || c == '(' || c == ')') {
                if (!number.isEmpty()) tokens.add(number.toString());
                tokens.add(String.valueOf(c));
                number = new StringBuilder();
            }
            else {
                throw new IllegalArgumentException("Invalid character: " + c);
            }
        }
        tokens.add(number.toString());
        return tokens;
    }

    private static double evaluate(List<String> tokens) {
        Stack<Integer> numbers = new Stack<>();
        Stack<Character> operators = new Stack<>();
        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/") || token.equals("^")) {
                operators.push(token.charAt(0));
            } else if (token.equals("(")) {
                operators.push(token.charAt(0));
            } else if (token.equals(")")) {
                while (operators.peek() != '(') {
                    char operator = operators.pop();
                    int right = numbers.pop();
                    int left = numbers.pop();
                    int result = switch (operator) {
                        case '+' -> left + right;
                        case '-' -> left - right;
                        case '*' -> left * right;
                        case '/' -> left / right;
                        case '^' -> (int) Math.pow(left, right);
                        default -> 0;
                    };
                    numbers.push(result);
                }
                operators.pop();
            } else {
                numbers.push(Integer.parseInt(token));
            }
        }

        while (!operators.isEmpty()) {
            char operator = operators.pop();
            int right = numbers.pop();
            int left = numbers.pop();
            int result = switch (operator) {
                case '+' -> left + right;
                case '-' -> left - right;
                case '*' -> left * right;
                case '/' -> left / right;
                default -> 0;
            };
            numbers.push(result);
        }
        return numbers.pop();
    }
}