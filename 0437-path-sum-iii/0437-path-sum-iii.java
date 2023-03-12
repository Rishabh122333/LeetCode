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
    public int pathSum(TreeNode root, int target) {
        if(root==null)
            return 0;
        int rootsum=countpath(root,target);
        int leftsum=pathSum(root.left,target);
        int rightsum=pathSum(root.right,target);
        return rootsum+leftsum+rightsum;
    }
    public static int countpath(TreeNode root,long target)
    {
        if(root==null)
            return 0;
        int ans=0;
        if(target-root.val==0)
                ans++;         //return nhi krna beacuse neeche aur path ho skta h
        ans+=countpath(root.left,target-root.val);
        ans+=countpath(root.right,target-root.val);
        return ans;
    }
}