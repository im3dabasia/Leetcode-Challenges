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
    int height;
    public int maxDepth(TreeNode root) {
        height = 0;
        
        traversor(root, 0);
        return height;
    }
    
    private void traversor(TreeNode temp, int index){
        if(temp == null){
            
            if(index > height){
                height = index;
            }
            return;
        }
        
        else{
            
            
            traversor(temp.left, index + 1);
            traversor(temp.right, index + 1);
            
        }
        
    }
}