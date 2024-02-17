//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s;
            s = sc.next();
           
            Solution ob = new Solution();
            
            System.out.println(ob.modify(s));    
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    String modify(String s) {
        StringBuilder v = new StringBuilder();
        StringBuilder result = new StringBuilder(s);

        for (int i = 0; i < s.length(); i++) {
            if ("aeiou".indexOf(s.charAt(i)) != -1) {
                v.append(s.charAt(i));
                result.setCharAt(i, '.');
            }
        }

        int j = 0;
        for (int i = result.length() - 1; i >= 0; i--) {
            if (result.charAt(i) == '.') {
                result.setCharAt(i, v.charAt(j++));
            }
        }

        return result.toString();
    }
}
