package linkedLists;

public class MySinglyLinkedList {

    ListNode head;
    ListNode tail;
    int size;

    boolean isEmpty() {
        return head == null;
    }

    public void addLast(int item) {

        ListNode newNode = new ListNode(item);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void insertFirst(int data) {

        ListNode newNode = new ListNode(data);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            head.next = newNode;
            head = newNode;
        }
        size++;
    }

    public void insertMiddle(int node) {

        ListNode newNode = new ListNode(node);

        if (isEmpty()) {
            head = tail = newNode;
        } else {

        }
        size++;
    }

    public void deleteFront(ListNode head) {

        ListNode current = head;

        if (isEmpty()) {
            System.out.println("List is empty");
        } else {
            current.next = null;
        }
        size--;
    }
}
