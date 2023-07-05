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
    public boolean isPalindrome(ListNode head) {
        int n=size(head);
        if(n==1)
            return true;
        ListNode mid=middle(head);
        if(n%2!=0)
            mid=mid.next;
        mid=reverse(mid);
        ListNode temp=head;
        while(mid!=null)
        {
            if(mid.val!=temp.val)
                return false;
            mid=mid.next;
            temp=temp.next;
        }
        return true;
    }
    public static int size(ListNode head)
    {
        ListNode temp=head;
        int c=0;
        while(temp!=null)
        {
            temp=temp.next;
            c++;
        }
        return c;
    }
    public ListNode middle(ListNode head) {
        ListNode fast=head,slow=head;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head) {
         if(head==null)
            return head;
        ListNode prev=null,temp=head,next=temp.next;
        while(temp!=null)
        {
            temp.next=prev;
            prev=temp;
            temp=next;
            if(next!=null)
                next=next.next;
        }
        return prev;
    }
}