//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String S = read.readLine();
            Solution obj = new Solution();
            System.out.println(obj.convert(S));
            
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String convert(String a) 
    { 
        // Create a StringBuilder to store the converted string
        StringBuilder ans = new StringBuilder();
        
        // Iterate over each character in the given string
        for(int i = 0; i < (int) a.length(); ++i)
    	{
    	    char ch=a.charAt(i);
    	    
            // If the character is a lowercase letter, replace it with its opposite lowercase letter
    		if(ch >= 'a' && ch <= 'z') 
    			ch = (char)('z' - (ch - 'a'));
    		
            // If the character is an uppercase letter, replace it with its opposite uppercase letter
    		else 
    			ch = (char)('Z' - (ch - 'A'));
    		
            // Append the converted character to the StringBuilder
    		ans.append(ch);
    	}
    	
        // Convert the StringBuilder back to a string and return it
    	return ans.toString();
    }
} 
