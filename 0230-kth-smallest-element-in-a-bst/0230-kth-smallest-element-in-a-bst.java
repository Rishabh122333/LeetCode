/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    // inorder of bst is in ascending order
    public int kthSmallest(TreeNode root, int k) {
        TreeNode curr=root;
        int c=0;
        while(curr!=null)
        {
            if(curr.left==null)
            {
                c++;
                if(c==k)
                {
                    return curr.val;
                }
                curr=curr.right;
            }
            else
            {
                TreeNode prev=curr.left;
                while(prev.right!=null && prev.right!=curr)
                {
                    prev=prev.right;
                }
                if(prev.right==null)
                {
                    prev.right=curr;
                    curr=curr.left;
                }
                else
                {
                    prev.right=null;
                    c++;
                    if(c==k)
                        return curr.val;
                    curr=curr.right;
                }
            }
        }
        return -1;
    }
}