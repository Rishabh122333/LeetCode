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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        {
            map.put(inorder[i],i);
        }
        return buildtree(preorder,inorder,0,preorder.length-1,0,inorder.length-1,map);
    }
    public static TreeNode buildtree(int [] preorder,int [] inorder,int prestart,int preend,int instart,int inend,HashMap <Integer,Integer> map)
    {
        if(prestart>preend || instart>inend)
            return null;
        TreeNode root=new TreeNode(preorder[prestart]);
        int inroot=map.get(root.val);
        int x=inroot-instart;
        root.left=buildtree(preorder,inorder,prestart+1,prestart+x,instart,inroot-1,map);
        root.right=buildtree(preorder,inorder,prestart+1+x,preend,inroot+1,inend,map);
        return root;
    }
}