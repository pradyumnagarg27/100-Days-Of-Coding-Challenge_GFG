//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int X1 = sc.nextInt();
            int Y1 = sc.nextInt();
            int R1 = sc.nextInt();
            int X2 = sc.nextInt();
            int Y2 = sc.nextInt();
            int R2 = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.circleTouch(X1, Y1, R1, X2, Y2, R2));
        }
    }
}
// } Driver Code Ends


// User function template for Java
class Solution {
    int circleTouch(int X1, int Y1, int R1, int X2, int Y2, int R2) {
        int d=(int)Math.sqrt(Math.pow(X1-X2,2)+Math.pow(Y2-Y1,2));
        if(R1+R2<=d){
            return 0;
        }else{
            return 1;
        }
    }
}
