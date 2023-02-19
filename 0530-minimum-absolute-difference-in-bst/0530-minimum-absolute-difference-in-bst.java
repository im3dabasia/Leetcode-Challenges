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
// class Solution {
//     public int getMinimumDifference(TreeNode root) {
        
//     }
// }

class Solution {
    int minDistance = Integer.MAX_VALUE;
    TreeNode prevValue;
    
    public int getMinimumDifference(TreeNode root) {
        inorderTraversal(root);

        return minDistance;
    }
    
    void inorderTraversal(TreeNode root) {
        if (root == null) {
          return;
        }
        
        inorderTraversal(root.left);
        // System.out.println(root.val);
        

        if (prevValue != null) {
            minDistance = Math.min(minDistance, root.val - prevValue.val);
        }
        prevValue = root;

        inorderTraversal(root.right);
  }
}