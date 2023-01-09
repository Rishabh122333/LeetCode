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
    // this sol helps us to save the time taken to calculate the length
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a=headA;
        ListNode b=headB;
        while(a!=b)
        {
            if(a==null)
                a=headB;
            else
                a=a.next;
            if(b==null)
                b=headA;
            else
                b=b.next;
        }
        return a;
    }
}