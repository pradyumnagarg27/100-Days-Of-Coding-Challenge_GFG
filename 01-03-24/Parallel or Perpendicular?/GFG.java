//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] S1 = br.readLine().trim().split(" ");
            String[] S2 = br.readLine().trim().split(" ");
            int[] A = new int[3];
            int[] B = new int[3];
            for(int i = 0; i < 3; i++)A[i] = Integer.parseInt(S1[i]);
            for(int i = 0; i < 3; i++)B[i] = Integer.parseInt(S2[i]);
            Solution ob = new Solution();
            int ans = ob.find(A, B);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int find(int[] A, int[] B)
    {
        if(A[0]*B[0]+A[1]*B[1]+A[2]*B[2]==0){
            return 2;
        }else if(Math.pow(A[1]*B[2]-A[2]*B[1],2)+Math.pow(A[2]*B[0]-A[0]*B[2],2)+Math.pow(A[0]*B[1]-A[1]*B[0],2)==0){
            return 1;
        }else{
            return 0;
        }
    }
}
