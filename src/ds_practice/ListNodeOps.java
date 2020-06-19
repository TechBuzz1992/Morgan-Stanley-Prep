package ds_practice;

import java.util.*;

public class ListNodeOps {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        new ListNodeOps().linkedListTraversal(head);

        
    }

    public void linkedListTraversal(ListNode head){
        ListNode dummy = head;
        while(dummy!=null){
            System.out.print(dummy.data + " ");
            dummy = dummy.next;
        }

        System.out.println("\nHead data is : " + head.data);

    }
    
}