package stacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GreaterThanTheirRight2 {

    public static void main(String[] args) {

        Integer[] arr = {20, 21, 18, 3, 4, 6, 1}; //21, 18, 6, 1
        System.out.println(find(arr));
    }

    public static List<Integer> find(Integer[]arr){

        // condition if arr==null && arr.length==0

        if (arr==null && arr.length==0){
            return new ArrayList<>();
        }

        // create stack
        Stack<Integer> stack = new Stack<>();

        // iterate the array
        for (int value : arr){

            while (!stack.isEmpty() && stack.peek() < value){
                stack.pop();
            }
            stack.push(value);
        }
        return new ArrayList<Integer>(stack);


        //check the element in while loop


        //print the elements



    }
}
