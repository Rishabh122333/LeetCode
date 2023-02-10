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
// inorder is sorted order in bst so we will reverse inorder i.e. RNL so that all greater nodes are visited 
class Solution {
    int sum=0;
    public TreeNode bstToGst(TreeNode root) {
        
        if(root==null)
            return root;
        bstToGst(root.right);
        sum+=root.val;
        root.val=sum;
        bstToGst(root.left);
        return root;
    }
}