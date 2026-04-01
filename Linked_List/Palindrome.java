package Linked_List;

public class Palindrome {
    public static void main(String[] args){
        ListNode list = new ListNode();

        list.addNode(1);
        list.addNode(3);
        list.addNode(3);
        list.addNode(4);
        list.addNode(3);
        list.addNode(3);
        list.addNode(1);

        list.printList(list.head);
        System.out.println(isPalindrome(list.head));
    }

    public static boolean isPalindrome(ListNode head){

        // Count total element
        int count=0;
        ListNode temp = head;
        while (temp!=null){
            count++;
            temp = temp.next;
        }

        // Find second half
        temp = head;
        int mid = count / 2;

        for (int i = 0; i < mid; i++){
            temp = temp.next;
        }

        // skip middle if odd
        if(count % 2 != 0){
            temp = temp.next;
        }

        //reverse second half
        ListNode prev = null;
        ListNode curr = temp;
        while (curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // compare
        ListNode rightPointer = prev;
        ListNode leftPointer = head;

        while (rightPointer!=null){
            if (leftPointer.val!=rightPointer.val){
                return false;
            }
            rightPointer = rightPointer.next;
            leftPointer = leftPointer.next;
        }

        return true;
    }

}
