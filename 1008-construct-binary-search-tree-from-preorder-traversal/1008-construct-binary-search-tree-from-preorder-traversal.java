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
    public TreeNode bstFromPreorder(int[] preorder) {
        int [] idx=new int[1];
        idx[0]=0;
        return calculate(preorder,Integer.MAX_VALUE,idx);
    }
    public static TreeNode calculate(int []preorder,int max,int[] idx)
    {
        if(idx[0]==preorder.length || preorder[idx[0]]>max)
            return null;
        TreeNode root=new TreeNode(preorder[idx[0]++]);
        root.left=calculate(preorder,root.val,idx);
        root.right=calculate(preorder,max,idx);
        return root;
    }
}