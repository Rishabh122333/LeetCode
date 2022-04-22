/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        int l=0;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
            {
                ListNode temp =slow;
                do
                {
                    temp=temp.next;
                    l++;
                }while(temp!=slow);
                break;
            }
        }
        if(l==0)
            return null;
         ListNode f=head;
         ListNode s=head;
         while(l>0)
         {
             s=s.next;
             l--;
         }
        while(f!=s)
        {
            f=f.next;
            s=s.next;
        }
        return s;
        
    }
}