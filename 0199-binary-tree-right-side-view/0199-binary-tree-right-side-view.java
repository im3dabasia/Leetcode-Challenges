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
    List<Integer> res;
    public List<Integer> rightSideView(TreeNode root) {
        res = new ArrayList<>();
        
        helper(root, 0);
        return res;
        
    }
    
    private void helper(TreeNode node, int idx){
        if(node == null){
            return;
        }
        
        if(idx == res.size()){
            res.add(node.val);
        }
        helper(node.right, idx + 1);
        helper(node.left, idx + 1);
        
        
    }
}