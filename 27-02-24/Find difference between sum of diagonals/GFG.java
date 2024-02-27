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
            int Grid[][] = new int[N][N];
            for (int i = 0; i < N; i++) {
                String[] s = read.readLine().split(" ");
                for (int j = 0; j < N; j++) Grid[i][j] = Integer.parseInt(s[j]);
            }
            Solution ob = new Solution();
            System.out.println(ob.diagonalSumDifference(N, Grid));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int diagonalSumDifference(int N, int[][] Grid) {
        int d1=0,d2=0;
        for(int i=0;i<N;i++){
            d1+=Grid[i][i];
            d2+=Grid[i][N-i-1];
        }
        return Math.abs(d1-d2);
    }
}
