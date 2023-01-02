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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        {
            map.put(inorder[i],i);
        }
        return buildtree(postorder,inorder,0,postorder.length-1,0,inorder.length-1,map);
    }
    public static TreeNode buildtree(int [] postorder,int [] inorder,int poststart,int postend,int instart,int inend,HashMap <Integer,Integer> map)
    {
        if(poststart>postend || instart>inend)
            return null;
        TreeNode root=new TreeNode(postorder[postend]);
        int inroot=map.get(root.val);
        int x=inroot-instart;
        root.left=buildtree(postorder,inorder,poststart,poststart+x-1,instart,inroot-1,map);
        root.right=buildtree(postorder,inorder,poststart+x,postend-1,inroot+1,inend,map);
        return root;
}
}