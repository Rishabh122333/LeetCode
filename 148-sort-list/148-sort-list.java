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
    public static ListNode middleNode(ListNode head) {
        ListNode fast=head.next;
        ListNode slow=head;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    public ListNode sortList(ListNode head) {
       return sort (head);
    }
    public static ListNode sort(ListNode head)
    {
        if(head==null || head.next==null)
                return head;
           ListNode mid=middleNode(head);
           ListNode temp1=head;
           ListNode temp2=mid.next;
           mid.next=null;
           temp1=sort(temp1);
           temp2=sort(temp2);
           return merge(temp1,temp2);
    }
     public static ListNode merge(ListNode temp1,ListNode temp2)
    {
        ListNode tlist=new ListNode(-1);
        ListNode list=tlist;
        while(temp1!=null && temp2!=null)
        {
            if(temp1.val<=temp2.val)
            {
                list.next=temp1;
                list=list.next;
                temp1=temp1.next;
            }
            else 
            {
                list.next=temp2;
                list=list.next;
                temp2=temp2.next;
            }
        }
        while (temp1!=null)
        {
            list.next=temp1;
            list=list.next;
            temp1=temp1.next;
        }
        while(temp2!=null)
        {
            list.next=temp2;
            list=list.next;
            temp2=temp2.next;
        }
        return tlist.next;
    }
}