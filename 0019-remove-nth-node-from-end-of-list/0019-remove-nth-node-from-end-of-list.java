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
    public ListNode removeNthFromEnd(ListNode head, int n) {
     
        if (head == null) {
            return null;
        }
        
        if((head.next == null) && (n == 1)){
            return null;
        }
        
            
        int i = 1;
        ListNode curr = head;
        ListNode temp = head;
        
        while(curr.next != null){
            
            if( i > n ){
                temp = temp.next;
            }
        
            curr = curr.next;
            i++;
            

        }
        if( n == i){
            return head.next;
        }
        
        temp.next = temp.next.next;
    return head ;
        
        
    }
}