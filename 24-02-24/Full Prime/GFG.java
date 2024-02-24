//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.fullPrime(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int fullPrime(int N){
        int i;
        
        // Checking for factors up to square root of N
        for(i=2;i*i<=N;i++)
            if(N%i==0)
                // If N is divisible by i, it is not a prime number
                return 0;
                
        // Checking if every digit of N is 2, 3, 5, or 7
        while(N>0){
            if(N%10!=2&&N%10!=3&&N%10!=5&&N%10!=7)
                // If any digit of N is not 2, 3, 5, or 7, it is not a full prime
                return 0;
            N/=10;
        }    
        
        // If all conditions are satisfied, N is a full prime
        return 1;
    }
}
