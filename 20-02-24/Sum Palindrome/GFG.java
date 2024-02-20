//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.isSumPalindrome(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static long reversDigits(long num) 
    { 
        long rev_num = 0; 
        while (num > 0) 
        { 
            rev_num = rev_num*10 + num%10; 
            num = num/10; 
        } 
        return rev_num; 
    } 
    static boolean isPalindrome(long num) 
    { 
        return (reversDigits(num) == num); 
    } 
    static long isSumPalindrome(long n){
        int count=0;
        while(!isPalindrome(n) && count<5)
        {
            long k=reversDigits(n);
            n+=k;
            count++;
        }
        if(isPalindrome(n)){
            return n;
        }
        return -1;
    }
}
