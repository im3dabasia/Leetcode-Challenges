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
    TreeNode temp; 
    
    public TreeNode insertIntoBST(TreeNode root, int val) {
        
        temp = new TreeNode(val);
        
        if (root == null) return temp;
        helper(root, val);
        return root;
    }
    private void helper(TreeNode node, int val ){
        if(val > node.val && node.right == null){
            node.right = temp;
            return;
        }else if( val < node.val && node.left == null){
            node.left = temp;
            return;
        }else if(node.left == null && node.right == null){
            
            if(val > node.val){
                node.right = temp;
            }else{
                node.left = temp;
            }
            return;

        }
            
        System.out.println(node.val);
        boolean checker = val > node.val;
        
        if(checker){
            helper(node.right, val);
        }else{
            helper(node.left, val);
        }

    }
}