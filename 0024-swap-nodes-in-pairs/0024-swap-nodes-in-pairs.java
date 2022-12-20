// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//     public ListNode swapPairs(ListNode head) {
//         if(head == null || head.next == null ) return head;
//         // if(head.next.next == null) return 
//         ListNode res = head.next;
//         ListNode a = head;
//         ListNode b = head.next;
//         ListNode c = head.next.next;
        
//         while (true) {
//             b.next = a;
//             a.next = c.next;
            
//             if (c == null || c.next == null || c.next.next == null) {
//                 b = c.next;
                
//                 b.next = c;
//                 c.next = null;
//                 // a.next.next = c;
//                 break;
//             }

            
//             a = c;
//             b = c.next;
//             c = c.next.next;
            


//         }
//         return res;
//     }
        
// }

class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(-1, head);
        ListNode dummyHead = dummy;
        ListNode a = head, b = head.next, c = head.next.next;

        while (true) {
            dummyHead.next = b;
            b.next = a;
            a.next = c;

            if (c == null || c.next == null) {
                break;
            }

            dummyHead = a;
            a = a.next;
            b = b.next.next.next;
            c = c.next.next;
        }

        return dummy.next;
    }
}