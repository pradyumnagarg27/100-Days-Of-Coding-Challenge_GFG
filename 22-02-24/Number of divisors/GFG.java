//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.count_divisors(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static long count_divisors(int n){
        long cnt = 0;
			for ( long i = 1; i*i <= n; i++)
			{
				//find divisors
				if(n % i == 0)
				{
					if(i == n/i)
					{
						// if divisile by 3 increase ans by 1
						if(i % 3 ==0)
							cnt++;
					}
					else
					{
						// if divisile by 3 increase ans by 1
						if(i % 3 == 0)
							cnt++;
						// if divisile by 3 increase ans by 1
						if((n / i) % 3 == 0)
							cnt++;
					}
				}
			}
			return cnt;
    }
}
