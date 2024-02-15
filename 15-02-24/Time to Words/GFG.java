//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] input = new String[2]; 
            input = br.readLine().split(" "); 
            int H = Integer.parseInt(input[0]); 
            int M = Integer.parseInt(input[1]); 
            Solution ob = new Solution();
            System.out.println(ob.timeToWord(H,M));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution
{
    public String timeToWord(int H, int M)
    {
        String[] nums = { "zero", "one", "two", "three", "four", 
                        "five", "six", "seven", "eight", "nine", 
                        "ten", "eleven", "twelve", "thirteen", 
                        "fourteen", "fifteen", "sixteen", "seventeen", 
                        "eighteen", "nineteen", "twenty", "twenty one", 
                        "twenty two", "twenty three", "twenty four", 
                        "twenty five", "twenty six", "twenty seven", 
                        "twenty eight", "twenty nine", 
                      }; 
        String result="";
        if (M == 0){
            //If minutes is 0, return the hour word followed by "o' clock".
            String s=nums[H]; 
            result= s+" o' clock";
        } 
        else if (M == 1){ 
            //If minutes is 1, return "one minute past" followed by the hour word.
            String s=nums[H];
            result= "one minute past "+s; 
        }
        else if (M == 59){ 
            //If minutes is 59, return "one minute to" followed by the word of the next hour.
            String s=nums[(H % 12) + 1];
            result= "one minute to "+s; 
        }
        else if (M == 15){ 
            //If minutes is 15, return "quarter past" followed by the hour word.
            String s=nums[H];
            result= "quarter past "+s; 
        }
        else if (M == 30){ 
            //If minutes is 30, return "half past" followed by the hour word.
            String s=nums[H];
            result= "half past "+s; 
        }
        else if (M == 45){ 
            //If minutes is 45, return "quarter to" followed by the word of the next hour.
            String s=nums[(H % 12) + 1];
            result= "quarter to "+s; 
        }
        else if (M <= 30){ 
            //If minutes is less than or equal to 30, return the word of minutes followed by "minutes past" and the hour word.
            String s=nums[M];
            String s1=nums[H];
            result= s+" minutes past "+s1; 
        }
        else if (M > 30){ 
            //If minutes is greater than 30, return the word of (60 - minutes) followed by "minutes to" and the word of the next hour.
            String s=nums[60 - M];
            String s1=nums[(H % 12) + 1];
            result= s+" minutes to "+s1; 
        }
        return result;
    }
}
