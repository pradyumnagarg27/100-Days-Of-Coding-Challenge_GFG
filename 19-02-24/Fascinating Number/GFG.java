//{ Driver Code Starts
import java.util.*;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Solution ob = new Solution();

        int T = sc.nextInt();

        while (T != 0) {
            long n = sc.nextLong();
            if (ob.fascinating(n))
                System.out.println("Fascinating");
            else
                System.out.println("Not Fascinating");
            T--;
        }
    }
}
// } Driver Code Ends


class Solution {
    boolean fascinating(long n) {
        if(n<100){
            return false;
        }
        String x=Long.toString(n)+Long.toString(n*2)+Long.toString(n*3);
        int [] hash = new int[10];
        
        //counting the frequency of each digit in the concatenated string
        for(int i = 0; i < x.length(); i++){
            hash[x.charAt(i) - '0']++;
        }
        
        //checking if each digit appears only once in the concatenated string
        for (int i = 1; i <= 9; i++) {
	        if (hash[i] != 1) {
	            //returning false if any digit appears more than once
	            return false;
	        }
	    }
	    
	    //returning true if each digit appears only once in the concatenated string
	    return true;
    }
}
