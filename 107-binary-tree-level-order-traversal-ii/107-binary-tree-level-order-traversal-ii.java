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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null)
            return ans;
        q.add(root);
        while(!q.isEmpty())
        {
            List<Integer> list=new ArrayList<>();
            int n=q.size();
            for(int i=0;i<n;i++)
            {
                TreeNode curr=q.poll();
                list.add(curr.val);
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!= null)
                    q.add(curr.right);
            }
            ans.add(0,list);
        }
        return ans;
    }
}