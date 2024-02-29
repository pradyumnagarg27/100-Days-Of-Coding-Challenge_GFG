//{ Driver Code Starts
// Initial template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = new String[6];
            S = read.readLine().split(" ");
            int A = Integer.parseInt(S[0]);
            int B = Integer.parseInt(S[1]);
            int C = Integer.parseInt(S[2]);
            int D = Integer.parseInt(S[3]);
            int E = Integer.parseInt(S[4]);
            int F = Integer.parseInt(S[5]);
            Solution ob = new Solution();

            System.out.println(ob.logicalOperation(A, B, C, D, E, F));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static int not(int x){
        if(x==0){
            return 1;
        }else{
            return 0;
        }
    }
    static int logicalOperation(int A,int B,int C,int D,int E,int F){
        if((not(A))*B + C*D +E*(not(F))==0){
            return 0;
        }else{
            return 1;
        }
    }
}