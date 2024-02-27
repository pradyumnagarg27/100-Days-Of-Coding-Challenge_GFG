//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String s = read.readLine();
            Solution ob = new Solution();
            ArrayList<String> ans = ob.extractIntegerWords(s);
            if(ans.size()==0)
                System.out.println("No Integers");
            else{
                for(int i=0;i<ans.size();i++)
                    System.out.print(ans.get(i)+" ");
                System.out.println();
            }
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    ArrayList<String> extractIntegerWords(String s) 
    { 
        ArrayList<String> a=new ArrayList<>();
        String x="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                x+=s.charAt(i);
            }else{
                if(x!=""){
                    a.add(x);
                }
                x="";
            }
        }
        if(x!=""){
            a.add(x);
        }
        return a;
    }
} 
