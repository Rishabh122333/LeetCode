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
        Stack<ListNode> st=new Stack<>();
        ListNode temp =new ListNode();
        ListNode dummy=temp;
        ListNode start=null;
        while(head!=null)
        {
            if(st.size()==0)
            {
                start=head;
            }
            st.push(head);
            if(st.size()==k)
            {
                while(!st.isEmpty())
                {
                    ListNode node=new ListNode(st.pop().val);
                    temp.next=node;
                    temp=temp.next;
                }
            }
            head=head.next;
        }
        if(st.size()>0)
            temp.next=start;
        return dummy.next;
    }
}