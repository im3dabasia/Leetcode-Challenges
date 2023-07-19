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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p|| root == q){
            return root;
        }
        // System.out.println("Root " + root.val);
        
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        // System.out.println("Left " + root.val);
        
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        // System.out.println("Right " + root.val);
         
        if(left == null) {
            // System.out.println("In Left");
            return right;
        }
        else if(right == null) {
            // System.out.println("In right");
            return left;
        }
        else {
            // System.out.println("In else");
            return root;
        }
    }
}