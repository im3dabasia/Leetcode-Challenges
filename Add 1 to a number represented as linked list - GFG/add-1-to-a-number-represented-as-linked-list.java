//{ Driver Code Starts
import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}
class GfG
{
    public static void printList(Node node) 
    { 
        while (node != null)
        { 
            System.out.print(node.data);
            node = node.next; 
        }  
        System.out.println();
    } 
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Node head = new Node( s.charAt(0) - '0' );
                    Node tail = head;
                    for(int i=1; i<s.length(); i++)
                    {
                        tail.next = new Node( s.charAt(i) - '0' );
                        tail = tail.next;
                    }
                    Solution obj = new Solution();
                    head = obj.addOne(head);
                    printList(head); 
                }
        }
}
// } Driver Code Ends


/*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
} 
*/

class Solution
{
    public static Node addOne(Node head) 
    { 
        //code here.
        if(head == null) return null;
        
        Node newHead = reverse(head);
        Node newCurr=newHead;
        
        while(newCurr != null){
            
            if(newCurr.data != 9){
                
                newCurr.data = newCurr.data + 1;
                break;
            }
            else if(newCurr.data == 9 && newCurr.next == null){
                
                newCurr.data = 1;
                Node newNode= new Node(0);
                newNode.next = newHead;
                newHead = newNode;
                newCurr = newCurr.next;
                
            }
            else{
                newCurr.data = 0;
                newCurr = newCurr.next;
            }
        }
        return reverse(newHead);
        
    }
    
    public static Node reverse(Node head) { 

        Node prev=null;
        Node curr=head;
        while(curr!=null)
        {
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
}
