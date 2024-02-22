//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
    		int[] res = new Sol().count (s);
    		
    		for (int i = 0; i < 4; i++)
    		    System.out.println (res[i]);
        }
        
    }
}
// Contributed By: Pranay Bansal

// } Driver Code Ends


//User function Template for Java

class Sol
{
    int[] count (String s)
    {
        char[] c=s.toCharArray();
        int l=0,u=0,d=0,sp=0;
        for(int i=0;i<c.length;i++){
            if(Character.isLowerCase(c[i])){
                l++;
            }else if(Character.isUpperCase(c[i])){
                u++;
            }else if(Character.isDigit(c[i])){
                d++;
            }else{
                sp++;
            }
        }
        int[] r={u,l,d,sp};
        return r;
    }
}
