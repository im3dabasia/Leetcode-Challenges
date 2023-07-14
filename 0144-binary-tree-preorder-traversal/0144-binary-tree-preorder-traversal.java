
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> tmp = new ArrayList<>();
        traversor(root, tmp);
        
        return tmp;
        
        
    }
    
    private void traversor(TreeNode node, List<Integer> tmp){
        
        if(node == null){
            return;
        }

        tmp.add(node.val);
        traversor(node.left, tmp);
        traversor(node.right, tmp);
        
    }
}