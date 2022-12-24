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
    public class pair
    {
        TreeNode node;
        int idx;
        pair(TreeNode n,int i)
        {
            node=n;
            idx=i;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        Queue<pair> q=new LinkedList<>();
        int ans=0;
        q.add(new pair(root,0));
        while(!q.isEmpty())
        {
            int n=q.size();
            int min=q.peek().idx;
            int left=0,right=0;
            for(int i=0;i<n;i++)
            {
                int curr=q.peek().idx-min;
                TreeNode node=q.peek().node;
                q.poll();
                if(i==0)
                    left=curr;
                if(i==n-1)
                    right=curr;
                if(node.left!=null)
                    q.add(new pair(node.left,curr*2+1));
                if(node.right!=null)
                    q.add(new pair(node.right,curr*2+2));
                
            }
            ans=Math.max(ans,right-left+1);
        }
        
        return ans;
        
    }
}