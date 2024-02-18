//{ Driver Code Starts
import java.util.Scanner;


// Main class named GFG
public class GFG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int key = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            Solution ob = new Solution();
            System.out.println(ob.findElementAtIndex(a, n, key));
        }

        scanner.close();
    }
}

// } Driver Code Ends


// User template class in Java
class Solution {
    // Function to find the element at a given index.
    public int findElementAtIndex(int[] a, int n, int key) {
        return a[key];
    }
}
