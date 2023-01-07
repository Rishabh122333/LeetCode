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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        inorder(root,list);
        return list;
    }
    //recursive solution
    // public static void inorder(TreeNode root,List<Integer> list)
    // {
    //      if(root==null)
    //         return;
    //     inorder(root.left,list);
    //     list.add(root.val);
    //     inorder(root.right,list);
    // }
    
    //Morris Traversal
    public static void inorder(TreeNode root,List<Integer> list){
        TreeNode curr=root;
        while(curr!=null)
        {
            if(curr.left==null)
            {
                list.add(curr.val);
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
                    list.add(curr.val);
                    curr=curr.right;
                }
            }
        }
    }
}