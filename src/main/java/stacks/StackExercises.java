package stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackExercises {

    public static void main(String[] args) {

        Deque<String> stack = new ArrayDeque<>();
        stack.push("one");
        stack.push("two");
        stack.push("three");
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.poll();
        System.out.println(stack);
    }


}
