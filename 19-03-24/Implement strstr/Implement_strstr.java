//{ Driver Code Starts
import java.util.*;


class Implement_strstr
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String line = sc.nextLine();
			String a = line.split(" ")[0];
			String b = line.split(" ")[1];
			
			GfG g = new GfG();
			System.out.println(g.strstr(a,b));
			
			t--;
		}
	}
}
// } Driver Code Ends


class GfG
{
    //Function to locate the occurrence of the string x in the string s.
    int strstr(String s, String x)
    {
       // Your code here
       int count=0,i=0;
        for(int j=0;j<s.length();j++){
            i=0;int u=j;
            if(j>(s.length()-x.length())){break;}
            while(i<x.length()){
                if(s.charAt(j)==x.charAt(i)){
                    count++;
                    j++;
                }
                i++;
            }
            j=u;
            if(count==x.length()){return u;}
            else{count=0;}
        }
        return -1;
    }
}
