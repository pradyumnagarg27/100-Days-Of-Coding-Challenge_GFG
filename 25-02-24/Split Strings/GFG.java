//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while(t-- > 0){
            String S = sc.nextLine();
            Solution ob = new Solution();
            List<String> ans = ob.splitString(S);
            for (String val: ans) 
                if(val == "")
                    System.out.println(-1); 
                else    
                    System.out.println(val); 
        }
    } 
} 


// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
    static List<String> splitString(String S) 
    { 
        List<String> r=new ArrayList<String>(3);
        String a="";
        String b="";
        String c="";
        for(int i=0;i<S.length();i++){
            if(Character.isUpperCase(S.charAt(i)) || Character.isLowerCase(S.charAt(i))){
                a+=S.charAt(i);
            } else if(Character.isDigit(S.charAt(i))){
                b+=S.charAt(i);
            } else {
                c+=S.charAt(i);
            }
        }
        r.add(a);
        r.add(b);
        r.add(c);
        return r;
    }
} 
