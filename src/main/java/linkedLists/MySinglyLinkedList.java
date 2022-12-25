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
            size++;
        }

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

        if (isEmpty()) System.out.println("List is empty");

        ListNode current = head;

        while (current != null){
            if (current==head){
                head = current.next;
                current.next = null;
                size--;
            }
        }
       current= current.next;

    }
    public void printLinkedList(){

        ListNode current = head;
        while (current != null){
            if (current.next == null){
                System.out.println(current.value + "=> null");
            }else{
                System.out.println(current.value + "=>");
            }
            current = current.next;
        }


    }




}
