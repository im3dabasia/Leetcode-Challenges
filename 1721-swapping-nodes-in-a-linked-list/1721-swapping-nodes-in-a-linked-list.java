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
    public ListNode swapNodes(ListNode head, int k) {
        
        ListNode temp1 = head;
        ListNode temp2 = head;
        ListNode temp3 = head;
        
        
        int cnt = 0;
        int num1 = -1;
        
        while(temp1 != null){
            
            cnt++;
            
            if (cnt == k){
                num1 = temp1.val;
                temp3 = temp1;
                System.out.println(num1);
            }
            temp1 = temp1.next;
            
        }
        
        cnt = cnt -k;
        
        while(cnt > 0){
            
            temp2 = temp2.next;
            cnt--;
            
        }
        if(num1 != -1 ){
            System.out.println(temp2.val);
            temp3.val = temp2.val;
            temp2.val = num1;
        }

            return head;
        
        
    }
}