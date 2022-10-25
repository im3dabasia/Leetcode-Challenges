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
    public ListNode rotateRight(ListNode head, int k) {
        
        if (head == null) return null;
        if (head.next == null) return head;
        
        int len = 0;
        ListNode temp = head;
        
        
        
        while(temp != null){
            
            len++;
            temp = temp.next;
            
        }
        k = k % len;
        
        temp = head;
        while (temp.next != null){
            
            temp = temp.next;
        }
        
        temp.next = head;
        
        temp = head;
        
        int j = 1;
        while (j != (len - k) ){
            
            temp = temp.next;
            j++;
        }
        
        ListNode res = temp.next;
        
        temp.next = null;
        
        return res;
        
        
    }
}