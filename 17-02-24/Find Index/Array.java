//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.lang.*;
import java.io.*;




class Array
 {
	public static void main (String[] args)
	 {
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 while(t-->0)
	    {
	    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i] = sc.nextInt();
		    }
		    int key = sc.nextInt();
		    Solution ob=new Solution();
		    int ar[]=ob.findIndex(arr,n,key);
		    System.out.println(ar[0]+" "+ar[1]);
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{ 
    // Function to find starting and end index 
    static int[] findIndex(int arr[], int n, int key) 
    { 
        int s=-1;
        int e=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                s=i;
                break;
            }
        }
        for(int i=n-1;i>=0;i--){
            if(arr[i]==key){
                e=i;
                break;
            }
        }
        int[] a={s,e};
        return a;
    }
}
