package linkedLists;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoLinkedLists {

    /*
    Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. If the two
    linked lists have no intersection at all, return null.
    For example, the following two linked lists begin to intersect at node c1:
    Notes :
    ▪ There are no cycles anywhere in the entire linked structure.
    ▪ Linked lists must retain their original structure after the function returns.
    Follow up: Could you write a solution that runs in O(m + n) time and use only O(1) memory? (SPICY)
     */

     public ListNode findIntersection(ListNode headA, ListNode headB){

         //create a set
         //create dummy variable to iterate
         //add one of the Linked List to the set
         //look for intersection node

         Set<ListNode> setNode = new HashSet<>();

         ListNode currentA = headA;
         ListNode currentB = headB;

         while (currentA != null){
             setNode.add(currentA);
             currentA = currentA.next;
         }
         while (currentB != null){
             if (setNode.contains(currentB)) return currentB;
             else{
                 currentB = currentB.next;
             }

         }




         return null;
     }







}
