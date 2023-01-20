//{ Driver Code Starts
import java.util.*;
import java.lang.Math;

class Sorting
{
	
	static void printArray(int arr[],int size)
	{
		int i;
		for(i=0;i<size;i++)
		System.out.print(arr[i]+" ");
	    System.out.println();
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
		
			for(int i=0;i<n;i++)
			a[i]= sc.nextInt();
			
			 new Solution().insertionSort(a,n);
			 printArray(a,n);
			
		t--;
		}
		
	}
}
// } Driver Code Ends


class Solution
{
  static void insert(int arr[],int i)
  {
       // Your code here
    //   System.out.println(i);
       int origIndex = i;
       while(i >= 1 && arr[i] < arr[i - 1]){
           swap(arr, i , i-1);
           i--;
       }
  }
  
  private static void swap(int arr[], int a, int b){
    //   System.out.println(a + " " + b);
      int temp = arr[a];
      arr[a] = arr[b];
      arr[b] = temp;
  }
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n)
  {
      //code here
      for(int i = 0 ; i  <arr.length + 1; i++){
          
          for(int j = 1; j < arr.length; j++){
              
              if(arr[j] < arr[ j - 1]){
                  
                  insert(arr, j);
              }
          }
      }
  }
}