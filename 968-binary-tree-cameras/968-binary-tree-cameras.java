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

//-1=cam req, 1=covered, 2=fit camera
class Solution {
    int c=0;
    public int minCameraCover(TreeNode root) {
        int count=countcamera(root);
        if(count==-1)
            c++;
        return c;
        
    }
    public  int countcamera(TreeNode root)
    {
        if(root==null)
            return 1;
        int left=countcamera(root.left);
        int right=countcamera(root.right);
        if(left==-1 || right==-1)
        {
            c++;
            return 2;
        }
        if(left==1 && right==1)
        {
            return -1;
        }
        else
        {
            return 1;
        }
    }
}