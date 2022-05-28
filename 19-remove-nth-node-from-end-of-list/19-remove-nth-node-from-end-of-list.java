/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public static ListNode deletefirst(ListNode head) {
        head = head.next;
        return head;
    }
     public static int sizeoflist(ListNode head)
    {
        ListNode temp=head;
        int c=0;
        while(temp!=null)
        {
            c++;
            temp=temp.next;
        }
        return  c;
    }
     public static ListNode get(ListNode head,int index) {
        ListNode temp = head;
        for (int i = 0; i < index; i++) {
            temp= temp.next;
        }
        return temp;
    }
     public static ListNode deletelast(ListNode head) {
         int x=sizeoflist(head);
          ListNode prev = get(head,x-2);
            prev.next = null;
         return head;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)
            return head;
        int x=sizeoflist(head);
        if(x==1)
            return null;
      if(n==x)
        return deletefirst(head);
        if(n==1)
           return deletelast(head);
        ListNode prev = get(head,x-n-1);
        if(prev.next.next!=null)
            prev.next = prev.next.next;
        return head;
    }
}