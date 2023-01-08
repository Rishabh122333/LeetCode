
public class Inorder_Successor_in_BST {

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

        public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {

            if (root == null) {
                return null;
            }

          TreeNode succ=null;
          while(root!=null)
          {
            if(p.val>=root.val)
            {
              root=root.right;
            }
            else
            {
              succ=root;
              root=root.left;
            }
          }
          return succ;

        }
    }

}
