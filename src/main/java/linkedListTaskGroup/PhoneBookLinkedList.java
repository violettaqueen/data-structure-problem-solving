package linkedListTaskGroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class PhoneBookLinkedList {

    PhoneNode head;
    PhoneNode tail;
    int size;

    public int getSize() {
        return size;
    }

    boolean isEmpty() {
        return head == null;
    }

    public void printPhoneBook() {

        PhoneNode current = head;

        while (current != null) {
            System.out.println(current.contact);
            current = current.next;  //jump to the next
        }
    }

    public void addFront(Contact contact) {

        PhoneNode newNode = new PhoneNode(contact);

        PhoneNode current = head;

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            current.next = head;
            head = newNode;
        }
        size++;
    }

    public void addEnd(Contact contact) {

        PhoneNode newNode = new PhoneNode(contact);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public PhoneNode findByFirstName(String firstName) {

        if (isEmpty()) {
            throw new NoSuchElementException("Not here guys");
        } else {
            PhoneNode current = head;

            while (current != null) {
                if (current.contact.getFirstName().equals(firstName)) {
                    return current;

                }
                current = current.next;
            }
            throw new NoSuchElementException("doesn't exist");
        }

    }

    public PhoneNode findByLastName(String lastName) {

        if (isEmpty()) {
            throw new NoSuchElementException("no element");
        }
        List<PhoneNode> listLastnames = new ArrayList<>();
        PhoneNode current = head;

        while (current != null) {
            if (current.contact.getLastName().equals(lastName)) {
                return current;
            }
            current = current.next;
        }
        throw new NoSuchElementException("doesn't exist");
    }

    public void deleteByFirstName(String firstName) {

        if (isEmpty()) {
            throw new NoSuchElementException("The not is not here");
        }
        PhoneNode prev = head;
        PhoneNode current = head;

        while (current != null) {
            if (current.contact.getFirstName().equals(firstName)) {
                if (current == head) {
                    head = current.next;
                } else if (current == tail) {
                    tail = prev;
                    prev.next = null;
                } else {
                    prev.next = current.next;
                    current.next = null;
                    size--;
                }
            }
            prev = current;
            current = current.next;
        }
    }

    public void deleteAllMatchingLastName(String lastName) {

        if (isEmpty()) {
            throw new NoSuchElementException("it's not here");
        }
        PhoneNode current = head;

        while (current != null && current.next != null) {
            if (current.next.contact.getLastName().equals(lastName)) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    public List<PhoneNode> findAll() {

        if (isEmpty()) {
            throw new NoSuchElementException("nothing here");
        }
        List<PhoneNode> listAll = new ArrayList<>();

        PhoneNode current = head;

        while (current != null) {
            listAll.add(current);
            current = current.next;
        }

        return listAll;
    }


}
