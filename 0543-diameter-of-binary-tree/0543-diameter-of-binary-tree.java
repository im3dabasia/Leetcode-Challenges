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
    int dm;
    public int diameterOfBinaryTree(TreeNode root) {
        dm =0;
        
        helper(root);
        return dm;
    }
    
    private int helper(TreeNode temp){
        if (temp == null )return 0;
        
        int left = helper(temp.left);
        
        int right = helper(temp.right);
        
        dm = Math.max(dm, left + right);
        
        return 1 + Math.max(left, right);
    }
}