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
    public boolean isSymmetric(TreeNode root) {
//         root will be common in a tree difference will come based on subtrees
        return checker(root.left, root.right);
        
    }
    private boolean checker(TreeNode A, TreeNode B){
        
        if(A == null && B == null) return true;
        if (A == null || B ==null) return false;
        
        return ((A.val == B.val) && checker(A.left , B.right) && checker(A.right, B.left));
    }
    
    
}