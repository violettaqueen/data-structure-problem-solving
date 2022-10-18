package linkedLists;

public class Get_Intersection_Node {

    public ListNode getIntersectionNode (ListNode headA, ListNode headB){

        ListNode first = headA;
        ListNode second = headB;

        while(first != second){
            if(first==null){
                first=headB;
            }else{
                first=first.next;
            }
            if(second == null){
                second=headA;
            }else{
                second = second.next;
            }
        }
        return first;


    }
}
