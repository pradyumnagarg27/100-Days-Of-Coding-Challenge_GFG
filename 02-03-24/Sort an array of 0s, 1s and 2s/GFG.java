//{ Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function template for Java

class Solution
{
    public static void sort012(int a[], int n)
    {
        int[] x=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                x[count]=0;
                count++;
            }
        }
        for(int i=0;i<n;i++){
            if(a[i]==1){
                x[count]=1;
                count++;
            }
        }
        for(int i=0;i<n;i++){
            if(a[i]==2){
                x[count]=2;
                count++;
            }
        }
        for(int i=0;i<n;i++){
            a[i]=x[i];
        }
    }
}

//{ Driver Code Starts.

class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob=new Solution();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}


// } Driver Code Ends
