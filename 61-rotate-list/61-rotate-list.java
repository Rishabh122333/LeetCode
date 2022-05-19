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
    public int size(ListNode head)
    {
        int c=0;
        ListNode temp=head;
        while(temp!=null)
        {
            c++;
            temp=temp.next;
        }
        return c;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null)
            return head;
        int c=size(head);
        int r=k%c;
        for(int i=0;i<r;i++)
        {
            ListNode temp=head;
            while(temp.next.next!=null)
                temp=temp.next;
            temp.next.next=head;
            head=temp.next;
            temp.next=null;
        }
        return head;
    }
}