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
    public ListNode middleNode(ListNode head) {
        int cnt = 0; 
        
        ListNode temp = head;
        
        while(temp != null){
            cnt++;
            temp = temp.next;
            
        }
        
        int mid = cnt/2 + 1;
        
        ListNode res = head;
        
        for(int i = 0; i < mid - 1; i++){
            res = res.next;
            
        }
        return res;
        
    }
}