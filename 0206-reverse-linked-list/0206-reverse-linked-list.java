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
    public ListNode reverseList(ListNode head) {
        
        if(head == null ) return null;
        ListNode res = head;
        
        ListNode curr = head;
        ListNode after = head.next;
        ListNode before = null;
        
        while(curr.next != null){
            
            curr.next = before;
            
            before = curr;
            curr = after;
            
            after = after.next;
        }
        curr.next = before;
        return curr;
    }
    
}