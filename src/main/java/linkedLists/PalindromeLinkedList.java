package linkedLists;

import java.util.Stack;

public class PalindromeLinkedList {

    public static void main(String[] args) {

    Node node = new Node(1);
    node.next = new Node(2);
    node.next.next = new Node(2);
    node.next.next.next = new Node(1);

        System.out.println(isPalindrome(node));
    }



    public static boolean isPalindrome(Node node) {
        /*
         * create stack
         * push all the nodes
         * compare the nodes with the stack content
         * return true if they are equal and false otherwise
         */

        Node current = node;
        Stack<Integer> stack = new Stack<>();

        while (current != null){
            stack.push(current.value);
            current= current.next;
        }

        while (node !=null){
            if (stack.pop() != node.value){
                return false;
            }
            node = node.next;
        }
        return true;
    }


}
