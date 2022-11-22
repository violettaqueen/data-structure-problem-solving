package linkedLists;

public class IterateLinkedList {

    public int iterateListNode(ListNode head) {

        int length = 0;
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }

}
