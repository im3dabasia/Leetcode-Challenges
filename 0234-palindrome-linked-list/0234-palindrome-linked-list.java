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
        
//         Approach 2; 
//        Get the length of the LList; 
        
        if(head.next == null) return true;
        
        int cntLen = 0;
        ListNode temp  = head;
        
        while (temp!= null){
            
            cntLen = cntLen +1;
            temp = temp.next;
        }
        
//      To get the middle element;
        
        int mid = 0;
        
        if( cntLen % 2 == 0){
            mid = cntLen / 2 ;
        }
        else{
            mid = cntLen / 2 +1;
        }
        
        
        
//      To go to the middle element
        temp = head;
        int iter = 1;
        
        while (iter < mid){
            
            temp= temp.next;
            iter++;
            
        }
        
//      Reverse the linkedlist after the middle + 1 element
        temp.next = reverseLinkedList(temp, temp.next);
        
        
        
        
        ListNode traversor = head;
        ListNode traversor1 = temp.next;
        
        iter = 0;
        
        while(iter < mid &&traversor1 != null){
            
            if(traversor.val != traversor1.val){
                return false;
            }
            iter++;
            traversor = traversor.next;
            traversor1= traversor1.next;
            
        }
        return true;
        
    }
    
    
    
    
    
    
//    reverse function to reverse the linkedlist from a given node onwards
    public ListNode reverseLinkedList(ListNode prev, ListNode head){
        if(head == null) {
            return null;
        }
        
        prev = null;
        ListNode curr = head;
        ListNode next = null;
        
        while(curr != null){
            next = curr.next;
            
            curr.next = prev;
            prev = curr;
            curr = next;
        
        }
        
        return prev;
        
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//         Approach 1
        
//         if(head.next == null){
//             return true;
//         }
        
//         ListNode temp = head;
//         List<Integer> res = new ArrayList<>();
        
        
//         while (temp != null){
//             res.add(temp.val);
//             temp = temp.next;
//         }
        
            
//         int low = 0;
//         int high  = res.size() -1; 
        
        
//         while( low < high){
            
//             if( res.get(low) != res.get(high)){
//                 return false;
//             }
        
//             low++;
//             high--;
//         }
        
//         return true;
        
