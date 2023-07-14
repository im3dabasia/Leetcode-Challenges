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
    public List<Integer> postorderTraversal(TreeNode root) {
        
    
        List<Integer> tmp = new ArrayList<>();
        traversor(root, tmp);
        
        return tmp;
        
        
    }
    
    private void traversor(TreeNode node, List<Integer> tmp){
        
        if(node == null){
            return;
        }

        traversor(node.left, tmp);
        traversor(node.right, tmp);
        tmp.add(node.val); 
    }
    }