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
            int B=sc.nextInt();
            int N=sc.nextInt();
			
            Solution ob = new Solution();
            String ans  = ob.getNumber(B,N);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static String getNumber(int B, int N){
         String s="";
        while(N!=0){
            int x=N%B;
            s=(x>=0 && x<=9)?(x+s):((char)(55+x)+s);
            N/=B;
        }
        return s;
    }
}
