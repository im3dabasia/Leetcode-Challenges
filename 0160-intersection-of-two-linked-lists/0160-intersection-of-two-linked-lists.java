/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
      
//APPROACH 2
        
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        
        Map<ListNode, Integer> map = new HashMap<>();
        
        while ( temp1 != null){
            
            map.put(temp1, temp1.val);
            
            temp1 = temp1.next;

        }
        
        while (temp2 != null){
            
            if(map.containsKey(temp2)){
                
                return temp2;
            }
            temp2  = temp2.next;
        }
        return null;
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
// Approach 1
//         ListNode temp1 = headA;
//         ListNode temp2 = headB;
        
        
//         while(temp1 != null){
            
//             while (temp2 != null){
                
//                 if(temp1 == temp2){
                    
//                     return temp1;
//                 }
//             }
//             temp2 = headB;
//             temp1 = temp1.next;
//         }
        
//         return null;
        
//     }
// }