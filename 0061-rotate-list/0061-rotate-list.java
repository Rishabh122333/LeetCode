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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null)
            return head;
        int n=size(head);
        k=k%n;
        for(int i=1;i<=k;i++)
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
}