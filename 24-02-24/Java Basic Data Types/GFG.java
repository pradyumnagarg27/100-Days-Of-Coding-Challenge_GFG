//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            Solution ob = new Solution();
            System.out.println(ob.javaIntType(sc));
            System.out.println(ob.javaStringType(sc));
            System.out.println(ob.javaFloatType(sc));
        }
    }
}
// } Driver Code Ends


class Solution {

    int javaIntType(Scanner sc) throws IOException {
        int r=sc.nextInt();
        return r;
    }
    
    String javaStringType(Scanner sc) throws IOException {
        String r=sc.next();
        return r;
    }
    
    float javaFloatType(Scanner sc) throws IOException {
        float r=sc.nextFloat();
        return r;
    }
};
