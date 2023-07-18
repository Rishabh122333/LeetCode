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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || k==1)
            return head;
        ListNode dummy=new ListNode();
        dummy.next=head;
        ListNode prev=dummy,curr=null,next=null;
        int size=size(head);
        while(size>=k)
        {
            curr=prev.next;
            next=curr.next;
            for(int i=1;i<k;i++)
            {
                curr.next=next.next;
                next.next=prev.next;
                prev.next=next;
                next=curr.next;
            }
            prev=curr;
            size-=k;
        }
        return dummy.next;
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
