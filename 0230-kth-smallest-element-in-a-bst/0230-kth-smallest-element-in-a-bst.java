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
    List<Integer> temp ;
    
    public int kthSmallest(TreeNode root, int k) {
        temp = new ArrayList<>();
        helper(root,  k );
        // System.out.println(temp);
        
        return temp.get(k -1);
    }
    
    public void helper(TreeNode root, int k) {
        
        if(root == null){
            return ;
        }

        helper(root.left,   k );
        temp.add(root.val);
        
        helper(root.right,   k );
        
    }
}