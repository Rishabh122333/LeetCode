/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public static void markfafa(TreeNode root,HashMap <TreeNode, TreeNode> map)
    {
        Queue <TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            TreeNode curr=q.poll();
            if(curr.left!=null)
            {
                map.put(curr.left,curr);
                q.add(curr.left);
            }
            if(curr.right!=null)
            {
                map.put(curr.right,curr);
                q.add(curr.right);
            }
        }
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> ans=new ArrayList<>();
        Queue <TreeNode> q=new LinkedList<>();
        HashMap <TreeNode, TreeNode> map=new HashMap<>();
        HashMap <TreeNode, Boolean> visited=new HashMap<>();
        markfafa(root,map);
        q.add(target);
        visited.put(target,true);
        int level=0;
        while(!q.isEmpty())
        {
            int n=q.size();
            if(level==k)
                break;
            for(int i=0;i<n;i++)
            {
                TreeNode curr=q.poll();
                if(curr.left!=null && visited.get(curr.left)==null)
                {
                    visited.put(curr.left,true);
                    q.add(curr.left);
                }
                if(curr.right!=null && visited.get(curr.right)==null)
                {
                    visited.put(curr.right,true);
                    q.add(curr.right);
                }
                if(map.get(curr)!=null && visited.get(map.get(curr))==null)
                {
                    visited.put(map.get(curr),true);
                    q.add(map.get(curr));
                }
            }
            level++;
        }
        while(!q.isEmpty())
        {
            ans.add(q.poll().val);
        }
        return ans;
        
    }
}