package Stack;


import Linked_List.ListNode;

public class Stack {
    public static ListNode top;

    public static void push(int x){
        if(top == null){
            top = new ListNode(x);
        }else{
            ListNode newNode = new ListNode(x);
            newNode.next = top;
            top = newNode;
        }
    }

    public static void peek(){
        if(top == null){
            System.out.println("stack is empty");
        }else{
            System.out.println(top.val);
        }
    }

    public static void pop(){
        if(top == null){
            System.out.println("stack is empty");
        }else{
            top = top.next;
        }
    }

}
