package Linked_List;

public class MergeList {
    public static void main(String[] args){
        ListNode listNode1 = new ListNode();
        listNode1.addNode(1);
        listNode1.addNode(2);
        listNode1.addNode(5);
        listNode1.addNode(8);
        listNode1.addNode(8);
//        listNode1.printList(listNode1.head);

        ListNode listNode2 = new ListNode();
        listNode2.addNode(1);
        listNode2.addNode(3);
        listNode2.addNode(3);
        listNode2.addNode(4);
        listNode2.addNode(6);
        listNode2.addNode(9);
//        listNode2.printList(listNode2.head);

        ListNode result = new MergeList(). mergedSortedList(listNode1.head, listNode2.head);
        result.printList(result);

    }

    public ListNode mergedSortedList(ListNode list1, ListNode list2){
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

//        Linked_List.ListNode node1 = list1;
//        Linked_List.ListNode node2 = list2;
        while (list1!=null && list2!=null){

            if(list1.val <= list2.val ){
/*
                temp.addNode( node1.val);
                temp.next = new Linked_List.ListNode(node1.val);
*/
                temp.next = list1;

                list1 = list1.next;
            }else {
//                temp.addNode(node2.val);
//                temp.next = new Linked_List.ListNode(node2.val);
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;

        }

        if(list1 != null) temp.next = list1;
        if(list2 != null) temp.next = list2;

        return dummy.next;
    }

}
