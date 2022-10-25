/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {

        if (head == null) return null;
        
        int len = 0;
        
        Node temp = head;
        
        while (temp != null){
            
            len++;
            System.out.println(temp);
            temp = temp.next;
        }
        
        
        
         temp = head;
        while(temp != null){
            
            Node newNode = new Node(temp.val);
            
            newNode.next = temp.next;
            temp.next = newNode;
            
            temp = temp.next.next;
        }
        
        temp = head;
        
        while(temp != null){
            System.out.println(temp);
            temp = temp.next;
        }
        
//      Adjusting the random pointers for the newNode linkedlists;
        
        temp = head;
        Node temp2 = head.next;
        int k = 1;
        while ( k <= len){
            
            if(temp.random == null){
                temp2.random = null;
            }
            else{
                temp2.random = temp.random.next;
                
            }
            
            
            if(temp.next != null){
            temp = temp.next.next;
                
            }
            
            if(temp2.next != null){
                temp2 = temp2.next.next;
                
            }

            k++;
        }
        
        temp = head;
        System.out.println("gggg");

        while(temp != null){
            System.out.println(temp.random);
            temp = temp.next;
        }
        
// Separating the 2 lists original and manmade;
        Node orig = head;
        Node copy = head.next;
        Node answer = copy;
        
        while(copy != null ){
            
            if(orig.next != null){
                orig.next = copy.next;
                
            }
            
            if(copy.next != null){
                copy.next = copy.next.next;
            
            }
            if(copy.next == null){
                orig.next = null;
            }
            
            orig = orig.next;
            copy = copy.next;
        }
        

        
        return answer;
    }
}