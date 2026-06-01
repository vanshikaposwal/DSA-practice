package Doubly_Linked_list;

public class Reverse_DLL {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        Doubly_LL temp= new Doubly_LL(arr[0]);

        for(int n:arr){
            temp.insertNode(n);
        }

        temp.printDLL(temp.head);
        Doubly_LL reversed = reverse(temp.head);
        temp.printDLL(reversed);
    }

    // null<-3->5->6->7->8->9->null;

    public static Doubly_LL  reverse(Doubly_LL dll){
        Doubly_LL p = null;
        Doubly_LL n =null;
        Doubly_LL curr = dll;
        while(curr!=null){
            p = curr.prev;//null,2
            n = curr.next; //2,null
            curr.prev = n; //2
            curr.next=p; //null
            curr = n; // 2
        }
        return p != null ? p.prev : null;
    }

}
