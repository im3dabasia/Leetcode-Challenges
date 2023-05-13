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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        
        int[][] matrix = new int[m][n];
        
        for(int[] arr: matrix){
            Arrays.fill(arr, -1);
        }
        
        int minR = 0;
        int minC = 0;

        int maxR = m -1;
        int maxC = n- 1;
        
        while(head != null){
             //top
            for(int i = minC; i <= maxC ; i++){
                matrix[minR][i] = head !=null ? head.val: -1;
                head = head.next;
                if(head == null) return matrix; 
            }
            minR++;

            //right
            for(int i = minR; i <= maxR ; i++){  
                matrix[i][maxC] = head !=null ? head.val: -1;
                head = head.next;
                if(head == null) return matrix; 
                
                
            }
            maxC--;

            //bottom        
            for(int i = maxC ; i >= minC ; i--){
                matrix[maxR][i ] = head !=null ? head.val: -1;
                head = head.next;
                if(head == null) return matrix; 
                
                

            }
            maxR--;

            //left
            for(int i = maxR ; i >= minR ; i--){
                matrix[i][minC] = head  !=null? head.val: -1;
                head = head.next;
                if(head == null) return matrix; 
                
                

            }
            minC++;
        }
        
        return matrix;
    }
    
    
}