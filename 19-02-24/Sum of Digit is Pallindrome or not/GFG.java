//{ Driver Code Starts
// Initial Template for Java

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
            System.out.println(ob.isDigitSumPalindrome(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int isDigitSumPalindrome(int N) {
        int s=0;
        while(N>9){
            s+=N%10;
            N/=10;
        }
        s+=N;
        String r=Integer.toString(s);
        for(int i=0;i<r.length()/2;i++){
            if(r.charAt(i)!=r.charAt(r.length()-i-1)){
                return 0;
            }
        }
        return 1;
    }
}
