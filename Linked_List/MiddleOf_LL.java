package Linked_List;

public class MiddleOf_LL {
    public static void main(String[] args){
        ListNode list = new ListNode();

        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        list.addNode(6);
        list.addNode(7);

        list.printList(list.head);

        ListNode midd = new MiddleOf_LL().middleNode(list.head);
        list.printList(midd);
    }

    public ListNode middleNode(ListNode head){
        int count =0;
        ListNode temp = head;
        while (temp!=null){
            count++;
            temp = temp.next;
        }
        int mid = count/2;

        ListNode curr = head;
        while (mid>0){
            curr = curr.next;
            mid--;
        }
        return curr;
    }

}
