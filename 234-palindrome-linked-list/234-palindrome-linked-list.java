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
    public ListNode middleNode(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;  
    }
     public static ListNode reverseList(ListNode head) {
        if(head==null)
            return head;
        ListNode prev=null;
        ListNode temp=head;
        ListNode next=temp.next;
        while(temp!=null)
        {
            temp.next=prev;
            prev=temp;
            temp=next;
            if(next!=null)
            {
                next=next.next;
            }
        }
        head=prev;
        return head;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode mid=middleNode(head);
        ListNode secondhead=reverseList(mid);
        ListNode temp=secondhead;
        while(head!=null && secondhead!=null)
        {
            if(head.val!=secondhead.val)
                break;
            head=head.next;
            secondhead=secondhead.next;
        }
        reverseList(temp);
        return head==null || secondhead==null;
}
}