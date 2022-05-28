/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
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
    public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
        if(head1==null)
            return head1;
        if(head2==null)
            return head2;
        int n1=sizeoflist(head1);
        int n2=sizeoflist(head2);
        if(n1==n2)
        {
            ListNode temp2=head2;
             ListNode temp1=head1;
            while(temp1!=null && temp2!=null)
            {
                if(temp1==temp2)
                    return temp1;
                temp1=temp1.next;
                temp2=temp2.next;
            } 
        }
        if(n2>n1)
        {
            int diff=n2-n1;
            ListNode temp2=head2;
             ListNode temp1=head1;
            for(int i=0;i<diff;i++)
                temp2=temp2.next;
            while(temp1!=null && temp2!=null)
            {
                if(temp1==temp2)
                    return temp1;
                temp1=temp1.next;
                temp2=temp2.next;
            } 
        }
        else 
        {
             int diff=n1-n2;
            ListNode temp2=head2;
             ListNode temp1=head1;
            for(int i=0;i<diff;i++)
                temp1=temp1.next;
            while(temp1!=null && temp2!=null)
            {
                if(temp1==temp2)
                    return temp1;
                temp1=temp1.next;
                temp2=temp2.next;
            } 
        }
        return null;
}
}