/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    
    List<Integer> temp;
    int size;
    public Solution(ListNode head) {
        temp = new ArrayList<>();
        
        ListNode curr = head;
        while(curr!=null){
            temp.add(curr.val);
            curr = curr.next;
        }
        
        size = temp.size();
        // System.out.println(temp);
        
    }
    
    public int getRandom() {
        double ans =  Math.random();
        // System.out.println(ans);
        
        double num =  (ans *size);
        // System.out.println(num);
        
        return temp.get( (int) num);
        
//         int pick = (int)(Math.random() * size);
//         return temp.get(pick);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */