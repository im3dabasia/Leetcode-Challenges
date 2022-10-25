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
    public boolean isPalindrome(ListNode head) {
        
        if(head.next == null){
            return true;
        }
        
        ListNode temp = head;
        List<Integer> res = new ArrayList<>();
        
        
        while (temp != null){
            res.add(temp.val);
            temp = temp.next;
        }
        
            
        int low = 0;
        int high  = res.size() -1; 
        
        
        while( low < high){
            
            if( res.get(low) != res.get(high)){
                return false;
            }
        
            low++;
            high--;
        }
        
        return true;
        
    }
}