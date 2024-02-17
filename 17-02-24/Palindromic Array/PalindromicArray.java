//{ Driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}
// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
	public static int palinArray(int[] a, int n){
	    int count=0;
		//iterating over each element in the array
		for(int i = 0; i < n ; i++)
		{
			//calling the check method to check if the element is a palindrome
			if(check(a[i])==1)
				//if the element is a palindrome, increment the count
				count++;
		}
		//if count is equal to the length of the array, return 1 indicating all elements are palindromes
		if(count==n)
			return 1;
		//otherwise, return 0 indicating not all elements are palindromes
		return 0;
	}
	
	//method to check if a number is a palindrome
	public static int check(int a){
		int m=a;
		int rev=0;
		//reversing the number
		while(a!=0){
			rev=(rev*10)+(a%10);
			a/=10;
		}
		//if the reversed number is equal to the original number, return 1 indicating it is a palindrome
		if(m==rev)
			return 1;
		//otherwise, return 0 indicating it is not a palindrome
		return 0;
	}
}
