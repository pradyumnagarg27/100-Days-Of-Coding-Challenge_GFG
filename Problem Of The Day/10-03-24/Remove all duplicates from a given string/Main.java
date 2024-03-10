//{ Driver Code Starts
//Initial Template for Java



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String str = br.readLine().trim();

            String ans = new Solution().removeDuplicates(str);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
       HashSet<Character> set = new HashSet<>();
       for (int i=0; i<str.length();i++) {
           if (set.add(str.charAt(i))) {
               sb.append(str.charAt(i));
           }
           
       }
       return sb.toString();
    }
}

