package ds_practice;

import java.util.*;

public class ListNodeOps {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(-8);
        head.next.next.next = new ListNode(2);

        ListNodeOps obj = new ListNodeOps();

        obj.linkedListTraversal(head);

        int ans = obj.getNthFromEnd(head, 3).data;

        System.out.println(ans);

        System.out.println("Get the largest value : " + obj.getTheLargestNodeValue(head));

    }

    public void linkedListTraversal(ListNode head) {
        ListNode dummy = head;
        while (dummy != null) {
            System.out.print(dummy.data + " ");
            dummy = dummy.next;
        }

        System.out.println("\nHead data is : " + head.data);

    }

    public ListNode getNthFromEnd(ListNode head, int n) {
        ListNode dummy = head;
        ListNode ans = head;
        int count = 1;
        while (dummy != null) {
            dummy = dummy.next;
            count++;
            if (count > n+1) {
                ans = ans.next;

            }

        }
        return ans;

    }

    public int getTheLargestNodeValue(ListNode head){
        int ans = Integer.MIN_VALUE;
        ListNode dummy = head;
        while(dummy!=null){
            if(ans<dummy.data){
                ans = dummy.data;
            }
            dummy = dummy.next;
        }
        return ans;
    }

}