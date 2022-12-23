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
    public boolean hasCycle(ListNode head) {
        
        if( head == null || head.next == null ) return false;
        
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        
        while(slowPtr != null){
            
            if(fastPtr.next == null || fastPtr.next.next == null) {
                return false;
                
            }
            
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            
            if(slowPtr == fastPtr) return true;
            
        }
        return false;
        
    }
}

// Approach 1
        
//         ListNode temp = new ListNode();
//         HashMap<ListNode, Integer> map = new HashMap<>();
        
        
//         while(temp != null){
        
            
//         if(map.containsKey(temp)){
            
//             return true;
            
//         }   
        
//         map.put(temp, 0);
            
        
//         temp = temp.next;
        
//         }
        
//         return false;

//         Approach2 

//         if( head == null) return false;
        
//         if( head.next == null ) return false;
        
//         ListNode slowPtr = head;
//         ListNode fastPtr = head;
        
//         while(slowPtr != null){

//             if(fastPtr.next == null || fastPtr.next.next == null){
                
//                 return false;

                
//             }
            
//             slowPtr = slowPtr.next;
//             fastPtr = fastPtr.next.next;
            
//             if(slowPtr == fastPtr){
                
//                 return true;
                
//             }
            
//         }
//         return false;