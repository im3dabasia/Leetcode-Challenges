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
        if(head.next== null)  return head;
        
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        
        while(fastPtr != null){
            
            
            if(fastPtr.next != null){
                fastPtr = fastPtr.next.next;
            }
            else{
                break;
            }
            
            slowPtr = slowPtr.next;
        }
        return slowPtr;
    }
}