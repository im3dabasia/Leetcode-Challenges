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
    public ListNode sortList(ListNode head) {
        
        List<Integer> res = new ArrayList<>();
        
        ListNode temp = head;
        
        while(temp != null){
            
            res.add(temp.val);
            
            temp = temp.next;
            
        }
        
        int[] arr = new int[res.size()];
        for (int i = 0; i < res.size(); i++){
            
            arr[i] = res.get(i);
            
            
        }
        Arrays.sort(arr);
        
        temp = head;
        int j = 0;
        
        while (temp!= null){
            
            temp.val = arr[j];
            j++;
            temp = temp.next;
            
        }
        
        return head;
        
    }
}