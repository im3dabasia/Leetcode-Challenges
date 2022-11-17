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
        List<Integer> ans = new ArrayList<>();
        traversor(root, ans);
        return ans;
        
    }
        private void traversor(TreeNode node, List<Integer> ans){

        if(node == null) return;

        traversor(node.left, ans);
        traversor(node.right, ans);
        ans.add(node.val);

    }

}