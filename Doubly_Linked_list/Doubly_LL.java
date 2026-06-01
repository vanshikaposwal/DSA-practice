package Doubly_Linked_list;

public class Doubly_LL {
    int val;
    Doubly_LL next;
    Doubly_LL prev;

    Doubly_LL(){
        this.next =null;
        this.prev = null;
    }

    Doubly_LL(int value){
        this.val = value;
        this.next =null;
        this.prev = null;
    }
    Doubly_LL(int value, Doubly_LL prev, Doubly_LL next){
        this.val = value;
        this.next =next;
        this.prev = prev;
    }

    Doubly_LL head = null;

    public void insertNode(int val){
        Doubly_LL newNode = new Doubly_LL(val);
        if(head == null){
            head = newNode;
            return;
        }
        Doubly_LL temp = head;
        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    public void printDLL(Doubly_LL head){
        Doubly_LL temp = head;
        while (temp!=null){
            System.out.print(temp.val+" ,");
            temp = temp.next;
        }
        System.out.println();
    }
}
