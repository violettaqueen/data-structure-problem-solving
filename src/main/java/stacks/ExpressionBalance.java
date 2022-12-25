package stacks;

public class ExpressionBalance {

    public static void main(String[] args) {

    }

    public static boolean isBalanced(String expr) {

        MyStack<Character> myStack = new MyStack<>();

        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);

            if (ch != '(' && ch != ')' && ch != '{' && ch != '}' && ch != '[' && ch != ']') return false;

            if (ch == '(' || ch == '{' || ch == '[') {
                myStack.push(ch);
                continue;
            }

            if (myStack.isEmpty()) return false;

            switch (ch) {
                case ')':
                    if (myStack.pop() != '(') return false;
                    break;
                case ']':
                    if (myStack.pop() != '[') return false;
                    break;
                case '}':
                    if (myStack.pop() != '{') return false;
                    break;
            }
        }
        return myStack.isEmpty();
    }
}