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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        calculate(root,0,ans);
        return ans;
    }
    // for right view first call will be of right side
    public static void calculate(TreeNode root,int level,List<Integer> ans)
    {
        if(root==null)
            return;
        if(ans.size()==level)
            ans.add(root.val);
        calculate(root.right,level+1,ans);
        calculate(root.left,level+1,ans);
    }
}