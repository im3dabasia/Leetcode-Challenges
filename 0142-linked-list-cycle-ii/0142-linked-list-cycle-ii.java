/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slowptr = head;
        ListNode fastptr = head;
        
        
        if (head == null || head.next == null){
            return null;
        }
        
        
        while(slowptr != fastptr || fastptr.next != null){
            slowptr = slowptr.next;
            if(fastptr.next != null){

                fastptr = fastptr.next.next;
                
            }
            
            if(fastptr == null || fastptr.next == null ){
                return null;
            }
            
            if(slowptr == fastptr){
                break;
            }
        }
        
        ListNode dummy = head;
        

        while(slowptr!= dummy){
            
            slowptr = slowptr.next;
            dummy = dummy.next;
            
        }
        return slowptr;
    }
}