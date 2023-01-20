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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list=new ArrayList<>();
        calculate(root,"",list);
        return list;
    }
    public static void calculate(TreeNode root,String ans,List<String> list)
    {
        if(root==null)
            return;
        if(root.left==null && root.right==null)
        {
            ans+=root.val;
            list.add(ans);
            return;
        }
        ans+=root.val+"->";
        if(root.left!=null)
            calculate(root.left,ans,list);
        if(root.right!=null)
            calculate(root.right,ans,list);
        
        
    }
    
}