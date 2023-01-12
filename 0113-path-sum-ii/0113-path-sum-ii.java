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
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        List<List<Integer>> ans =new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        calculate(root,target,list,ans);
        return ans;
    }
    public static void calculate(TreeNode root,int target,List<Integer> list,List<List<Integer>> ans)
    {
        if(root==null)
            return;
        list.add(root.val);
        if(root.right==null && root.left==null)
        {
            if(target-root.val==0)
            {
                ans.add(new ArrayList<>(list));
                return;
            }
        }
        if(root.left!=null)
        {
            calculate(root.left,target-root.val,list,ans);
            list.remove(list.size()-1);
        }
        if(root.right!=null)
        {
            calculate(root.right,target-root.val,list,ans);
            list.remove(list.size()-1);
        }
}
}