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
    TreeNode res;
    public TreeNode searchBST(TreeNode root, int val) {
        
        TreeNode temp = new TreeNode();
        
         TreeNode ab = helper(root, val);
        return res;
        
    }
    private TreeNode helper(TreeNode root, int val){
        if(root == null) return null;
        System.out.println(root.val);
        
        if(root.val == val){
            res = root;
            return root; 
        }
        
        helper(root.left, val);
        helper(root.right, val);
        
        return null;
        
    }
}