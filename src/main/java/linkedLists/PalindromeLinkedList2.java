package linkedLists;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class PalindromeLinkedList2 {

    public static void main(String[] args) {

        StringNode node = new StringNode("racecar");
        node.next = new StringNode("violetta");
        System.out.println(isPalindrome(node));

    }

    public static boolean isPalindrome(StringNode head){
        Deque<String> stack = new LinkedList<>();

        StringNode current = head;

        while (current!= null){
            stack.push(current.value);
            current= current.next;
        }
        current=head;
        while (current!= null){
            if (current.value != stack.pop()){
                return false;
            }
            current = current.next;
        }
        return true;
    }

}
