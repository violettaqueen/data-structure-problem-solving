package queue;

import java.util.Stack;

public class MyQueue {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    void enqueue(int num){

        //how can we store num into a queue, with a ready methods of stack.
        //We want FIFO algorithms but use Stack methods

        stack1.push(num); //1,2,3,4
    }

    int dequeue(){
        peek(); // stack 1 - normal, stack 2 - reverse
        return stack2.pop();
    }

    int peek(){
        // while stack is not empty, peek up from stack 1 push to a second stack, because we want to reverse it
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop()); //4,3,2,1
        }
        return stack2.peek();
    }

    boolean empty(){

        return stack1.isEmpty() && stack2.isEmpty();

        }
    }


