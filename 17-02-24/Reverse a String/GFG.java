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
            String S = read.readLine();
            Solution ob = new Solution();

            System.out.println(ob.revStr(S));
        }
    }
}
// } Driver Code Ends


class Solution {
    static String revStr(String S) {
        String r="";
        for(int i=0;i<S.length();i++){
            r+=S.charAt(S.length()-i-1);
        }
        return r;
    }
}
