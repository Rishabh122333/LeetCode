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
    static int ans=0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)
            return 0;
        int arr[]=new int [1];
       calculate(root,arr);
        return arr[0];
            
    }
    public static int calculate(TreeNode root,int []arr)
    {
        if(root==null)
            return 0;
        int l=calculate(root.left,arr);
        int r=calculate(root.right,arr);
        arr[0]=Math.max(arr[0],l+r);
        return 1+Math.max(l,r);
    }
}