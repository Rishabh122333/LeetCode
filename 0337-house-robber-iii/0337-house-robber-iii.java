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
    public int rob(TreeNode root) {
        HashMap<TreeNode,Integer>map=new HashMap<>();
        return calculate(root,map);
    }
    public static int calculate(TreeNode root,HashMap<TreeNode,Integer>map)
    {
        if(root==null)
            return 0;
        if(map.containsKey(root))
            return map.get(root);
        int loot =root.val;
        if(root.left!=null)
            loot+=calculate(root.left.left,map)+calculate(root.left.right,map);
        if(root.right!=null)
            loot+=calculate(root.right.left,map)+calculate(root.right.right,map);
        int notloot=calculate(root.left,map)+calculate(root.right,map);
        int ans=Math.max(loot,notloot);
        map.put(root,ans);
        return ans;
    }
}