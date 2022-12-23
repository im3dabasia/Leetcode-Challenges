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
        if (head == null || head.next == null){
            return null;
        }

        HashMap<ListNode, Integer> map = new HashMap<>();
        
        ListNode temp = head;
        
        int i = 0;
        int ans = 0;
        while(temp != null){
            
            if(!map.containsKey(temp)){
                map.put(temp, i);
            }
            else{
                ans =  map.get(temp);
                break;
            }
            temp = temp.next;
            i++;
            
        }
        ListNode dummy = head;
        for(int k = 0; k < ans; k++){
            dummy = dummy.next;
        }  
        
        if(temp == null) return null;
        return dummy;
    }
}

// Approach 1
//         ListNode slowptr = head;
//         ListNode fastptr = head;
        
        
//         if (head == null || head.next == null){
//             return null;
//         }
        
        
//         while(slowptr != fastptr || fastptr.next != null){
//             slowptr = slowptr.next;
//             if(fastptr.next != null){

//                 fastptr = fastptr.next.next;
                
//             }
            
//             if(fastptr == null || fastptr.next == null ){
//                 return null;
//             }
            
//             if(slowptr == fastptr){
//                 break;
//             }
//         }
        
//         ListNode dummy = head;
        

//         while(slowptr!= dummy){
            
//             slowptr = slowptr.next;
//             dummy = dummy.next;
            
//         }
//         return slowptr;