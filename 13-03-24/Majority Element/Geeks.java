//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int size)
    {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i : a){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        int maxElement = -1;
        for (Map.Entry<Integer, Integer> i : map.entrySet()){
            if (i.getValue() > max){
                max = i.getValue();
                maxElement = i.getKey();
            }
        }
        if (max > size/2) return maxElement;
        else return -1;
    }
}
