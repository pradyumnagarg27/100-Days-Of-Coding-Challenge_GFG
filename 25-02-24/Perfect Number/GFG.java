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
            System.out.println(ob.isPerfect(N));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int isPerfect(int N) {
        // Array to store factorials.
        int fact[] = new int[10];
        fact[0] = 1;
        for (int i = 1; i < 10; i++) fact[i] = fact[i - 1] * i;
        // storing the factorial of all digits
        // makes sure we don't calculate factorial
        // for digits multiple times.
        int store = N; // storing original number
        int sum = 0;
        while (N > 0) {
            sum += fact[N % 10]; // adding factorials of digits
            N /= 10;
        }
        return (store == sum ? 1 : 0);
    }
}
