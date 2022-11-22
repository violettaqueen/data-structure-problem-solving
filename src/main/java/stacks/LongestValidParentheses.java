package stacks;

import java.util.Stack;

public class LongestValidParentheses {

    public static int longestValidParenthesis(String str) {

        if (str == null) return 0;

        Stack<Integer> stack = new Stack<>();
        int result = 0;
        stack.push(-1);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ')' && stack.size() > 1 && str.charAt(stack.peek()) == '(') {
                stack.pop();
                result = Math.max(result, i - stack.peek());
            } else {
                stack.push(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {

        String str = "())())";
        System.out.println(longestValidParenthesis(str));


    }


}
