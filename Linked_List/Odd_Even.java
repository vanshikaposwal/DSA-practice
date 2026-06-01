package Linked_List;

public class Odd_Even {

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

        ListNode midd = new Odd_Even().oddEvenList(list.head);
        list.printList(midd);
    }

    public ListNode oddEvenList(ListNode head) {
        ListNode result = new ListNode(head.val);
        ListNode dumb = result;
        ListNode temp = head.next.next;
        while(temp!=null && temp.next!=null){
            dumb = new ListNode(temp.val);
            dumb = dumb.next;
            temp = temp.next.next;
        }

        temp = head.next;
        while(temp!=null && temp.next!=null){
            dumb = new ListNode(temp.val);
            dumb = dumb.next;
            temp = temp.next.next;
        }
        return result;
    }
}
