package Linked_List;

public class ReorderList {

    public void reorderList(ListNode head) {
        int length = 0;
        ListNode temp = head;
        while(temp!= null){
            length ++;
            temp = temp.next;
        }
        int half = (length+1)/2;

        temp = head;
        while(half>1){
            half--;
            temp = temp.next;
        }

        // divide list in two parts
        ListNode halfList = temp.next;
        temp.next = null;

        // reverse second half
        ListNode current = halfList;
        ListNode prev = null;
        while(current!=null){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        halfList = prev;

        // Now reorder and join both lists
        ListNode firstHalf = head;
        ListNode secondHalf = halfList;

        while (firstHalf != null && secondHalf != null){

            ListNode node1 = firstHalf.next;
            ListNode node2 = secondHalf.next;
            firstHalf.next = secondHalf;
            secondHalf.next = node1;
            secondHalf = node2;
            firstHalf = firstHalf.next.next;

        }
    }
}
