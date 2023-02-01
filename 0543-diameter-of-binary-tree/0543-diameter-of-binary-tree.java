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
            
        dm = 0;
        helper(root, 0);
        return dm;
        
    }
    private int helper(TreeNode node, int diameter){
        
        if(node == null) return 0;
            
        // System.out.println(node.val);
        int left = helper(node.left, diameter);
        // System.out.println("L" +node.val + " " + left );
        
        int right = helper(node.right, diameter);
        // System.out.println("R" + node.val + " " + right );
        
        dm = Math.max(dm, left + right);
        return 1 + Math.max(left, right);
    }
}