package logics;

import java.util.Stack;

public class CheckBalancedBrackets {


    public static void main(String[] args) {
        String expr = "([[([{}])]])";

        // Function call
        if (areBracketsBalanced(expr)) {
            System.out.println("Balanced ");
        } else {
            System.out.println("Not Balanced ");
        }
    }

    private static boolean areBracketsBalanced(String expr) {

        Stack<Character> stringStack = new Stack<>();

        for (int i = 0; i < expr.length(); i++) {

            if (expr.charAt(i) == '(' || expr.charAt(i) == '{' || expr.charAt(i) == '[') {
                stringStack.push(expr.charAt(i));
            } else {
                if (stringStack.isEmpty()) {
                    return false;
                }
                Character pop_val = stringStack.pop();
                if (pop_val == '(' && expr.charAt(i) != ')') {
                    return false;
                }
                if (pop_val == '{' && expr.charAt(i) != '}') {
                    return false;
                }
                if (pop_val == '[' && expr.charAt(i) != ']') {
                    return false;
                }

            }
        }
        if(stringStack.isEmpty())
            return true;
        else
            return false;

    }

}
