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
    public ListNode mergeNodes(ListNode head) {
        List<Integer> res = new ArrayList<>();
        
        ListNode temp = head.next;
        
        while(temp != null){
            
            int sum = 0;
            
            while(temp.val != 0){
                sum = sum + temp.val;
                
                temp = temp.next;
                
            }
            res.add(sum);
            temp = temp.next;
        }
        
        ListNode dummy = new ListNode(-1, null);
        ListNode ans = dummy;
        
        for(int i = 0; i <  res.size(); i++){
            
            dummy.next = new ListNode(res.get(i),null);
            dummy = dummy.next;
            
        }

        return ans.next;
    }
}