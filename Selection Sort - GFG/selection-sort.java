//{ Driver Code Starts
import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n]; 
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
		
			Solution obj = new Solution();
			obj.selectionSort(arr, n);
			
			for(int i=0;i<n;i++)
		    	System.out.print(arr[i]+" ");
		    System.out.println();
			t--;
		}
		
	}
}

// } Driver Code Ends


class Solution
{
	int  select(int arr[], int i, int x)
	{
        // code here such that selectionSort() sorts arr[]
        int minElement = Integer.MAX_VALUE;
        int indexMinElement = 0;
        // System.out.println(x);
        
        for(int j = x ; j < arr.length; j++){
            
            if(arr[j] < minElement){
                minElement = arr[j];
                indexMinElement = j;
            } 
           
        }
        // System.out.println(indexMinElement);
        return indexMinElement;
	}
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    int x = 0;
	    for(int i = 0 ; i <arr.length; i++){
	       // x++;
	        
	        int j = select(arr, i, x++);
	        swap( arr, j, i);
	        
	    }
	}
	
	private void swap(int arr[], int indexA, int indexB){
	   // System.out.println("Index pos: " + "" + indexA + " " + ind/exB);
	    int temp = arr[indexA];
	    arr[indexA] = arr[indexB];
	    arr[indexB] = temp;
	}
}