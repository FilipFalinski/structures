package unit4;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedBrackets {
    static boolean isBalanced(String expression) {

        Deque<Character> stack
                = new ArrayDeque<Character>();


        for (int i = 0; i < expression.length(); i++) {
            char x = expression.charAt(i);

            if (x == '(' || x == '[' || x == '{') {

                stack.push(x);
                continue;
            }


            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }


        return (stack.isEmpty());
    }


    public static void main(String[] args) {
        String expression = "([{}])))";


        if (isBalanced(expression))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }



}
