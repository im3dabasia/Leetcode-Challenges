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
    public boolean isBalanced(TreeNode root) {
        int ans  = dfsHeight(root);
        // System.out.println("Ans" + ans);
        return ans!= -1;
    }
    private int dfsHeight(TreeNode temp){
        if(temp == null){
            return 0;
        }
        // System.out.println(temp.val + " " );
        
        int left = dfsHeight(temp.left);
        // System.out.println(temp.val + " " + left);

        if(left == -1){
            // System.out.println( "left " + temp.val + " " + left);
            return -1;  
        } 
        int right =dfsHeight(temp.right);
        // System.out.println(temp.val + " " + right);
        
        if(right == -1){
            // System.out.println( "right " +temp.val + " " + left);
            return -1;  
        } 
        
        if(Math.abs(left - right) <=  1)  return Math.max(left, right) + 1 ; 
        else return   -1;
    }
}