package stacks;

import java.util.Stack;

public class GreaterThenTheirRightOptimal {

    public static void main(String[] args) {

        Integer[]arr = {10,4,6,3,5};
        find(arr);
    }
    public static void find(Integer[]arr){

        if (arr == null && arr.length == 0){
            return;
        }
        Stack<Integer> stack = new Stack<>();

        for (int value : arr){

            while (!stack.isEmpty() && stack.peek() < value){
                stack.pop();
            }
            stack.push(value);
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop() + " ");
        }
    }
}
