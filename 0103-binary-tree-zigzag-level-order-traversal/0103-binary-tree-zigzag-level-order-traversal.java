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
     List<List<Integer>> ans;
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        
        if(root == null ) return res;
        
        q.offer(root);
        
        while(!q.isEmpty()){
            int level = q.size();
            List<Integer> temp  = new ArrayList<>();
            
            for(int i =0; i < level ; i++){
                
                if(q.peek().left != null) q.offer(q.peek().left);
                if(q.peek().right != null) q.offer(q.peek().right);
                
                temp.add(q.peek().val);
                q.poll();
                
            }
            if(res.size() % 2 == 1){
                Collections.reverse(temp);
                System.out.println(temp.toString());
                res.add(temp);
            }else{
            res.add(temp);
                
                
            }
        }
        return res;
         
    }
}