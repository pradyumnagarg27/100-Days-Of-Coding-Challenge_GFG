//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int A = sc.nextInt();
                    int B = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.gcd(A,B));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int gcd(int a , int b) 
    { 
        if (a == 0)
            return b;
        if (b == 0)
            return a;
 
        // Base case
        if (a == b)
            return a;
 
        // a is greater
        if (a > b)
            return gcd(a - b, b);
        return gcd(a, b - a);
    } 
}
