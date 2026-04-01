package Linked_List;

public class ListNode {
    int val; //Value
    ListNode next; //Next Pointer

    // Default Constructor
    ListNode(){}

    // Constructor with value
    ListNode(int value){
        this.val = value;
    }

    // Constructor with value and Pointer
    ListNode(int value, ListNode next){
        this.val = value;
        this.next = next;
    }

    ListNode head;

    public void addNode(int value){
        ListNode newNode = new ListNode(value);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode temp = head;
        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void printList(ListNode head){
        ListNode temp = head;
        while (temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    public void printNode(ListNode head ){
        System.out.println(head.val);
        System.out.println(head.next.val);
    }

    public ListNode peek(){
        return head;
    }



}
