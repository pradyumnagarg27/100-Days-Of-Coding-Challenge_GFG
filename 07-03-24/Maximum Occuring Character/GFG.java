//{ Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
{
	public static void main (String[] args) throws IOException
	{
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int tc=Integer.parseInt(br.readLine().trim());
	 
	 while(tc-- >0)
	 {
	     String line=br.readLine().trim();
	     
	     Solution obj = new Solution();
	     
	     System.out.println(obj.getMaxOccuringChar(line));
	     
	 }
	 }
}
// } Driver Code Ends



class Solution
{
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line)
    {
        int[] count=new int[26];
        
        for(int i=0;i<line.length();i++){
            count[line.charAt(i)-'a']++;
        }
        int max=count[0];
        int ind=0;
        for(int i=0;i<26;i++){
            if(count[i]>max){
                max=count[i];
                ind=i;
            }
        }
        return (char)(ind+'a');
    }
    
}
