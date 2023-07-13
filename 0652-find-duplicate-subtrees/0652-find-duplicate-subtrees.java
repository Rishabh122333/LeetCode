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
    HashMap<String,TreeNode> map=new HashMap<>();
    HashSet<TreeNode> set=new HashSet<>();
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        calculate(root);
        return new ArrayList<>(set);
        
    }
    public  String calculate(TreeNode root)
    {
        if(root==null)
            return "X";
        String left=calculate(root.left);
        String right=calculate(root.right);
        String str=root.val +" "+left+" "+right;
        if(map.containsKey(str))
            set.add(map.get(str));
        else
            map.put(str,root);
        return str;
        
    }
}