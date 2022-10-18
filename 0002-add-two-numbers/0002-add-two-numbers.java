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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(); 
        ListNode temp = dummy;
        temp.val = 0;
        
        int carry = 0;
        int sum = 0;
        
        while(l1 != null || l2 != null || carry == 1){
            sum = 0;
            int num1 = 0;
            int num2 = 0;
            
            if(l1 != null){
                num1 = l1.val;
                l1 = l1.next;
            }
            
            if(l2  != null){
                num2 = l2.val;
                l2 = l2.next;
            }
            
            sum = num1 + num2;
            sum = sum + carry;
            
            // if(sum > 9){
                carry = sum / 10;
                sum = sum % 10;
            // }
            num1 = 0;
            num2 = 0;
            
            ListNode node = new ListNode(); 
        
            node.val = sum;
            temp.next = node;
            
            temp = temp.next;
            

        }
        return dummy.next;
    }
}