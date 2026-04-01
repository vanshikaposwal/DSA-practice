package Linked_List;

public class PrintList {
    public static void main(String[] args){
        ListNode list = new ListNode();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.printList(list.head);

        PrintList l = new PrintList();

        ListNode result = l.reverseList(list.head);
        list.printList(result);
    }

    public ListNode reverseList(ListNode head){
        ListNode pre = null;
        ListNode curr = head;
        ListNode next = head;

        while (next != null){
            next = curr.next;//2
            curr.next = pre;//null
            pre = curr;//1
            curr = next;
        }
        head = pre;
        return head;
    }

}
