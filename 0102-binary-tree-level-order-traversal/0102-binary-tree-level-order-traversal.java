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
    public List<List<Integer>> levelOrder(TreeNode node) {
        
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        
        if (node == null) return res;
        
        q.add(node);
        
        while(!q.isEmpty()){
            
            int size = q.size();
            
            List<Integer> tmp = new ArrayList<>();
            for(int i =0 ; i < size; i++){
                TreeNode currNode = q.remove();
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
                tmp.add(currNode.val);
            }
            res.add(new ArrayList<>(tmp));
        }
        
        return res;
        
    }
}