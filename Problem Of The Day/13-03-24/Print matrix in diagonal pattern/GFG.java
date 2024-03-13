//{ Driver Code Starts
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
            int n = Integer.parseInt(br.readLine().trim());
            int[][] mat = new int[n][n];
            String[] S = br.readLine().trim().split(" ");
            int i = 0;
            int j = 0;
            for(int k = 0; k < S.length; k++){
                mat[i][j] = Integer.parseInt(S[k]);
                j++;
                if(j == n){
                    i++;
                    j = 0;
                }
            }
            Solution obj = new Solution();
            int[] ans = obj.matrixDiagonally(mat);
            for(int it = 0; it < ans.length; it++){
                System.out.print(ans[it] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    private boolean isPossible(int i, int j, int n, int m) {
        return i < n && j < m && i >= 0 && j >= 0;
    }
    
    public int[] matrixDiagonally(int[][] mat) {
        List<Integer> ans = new ArrayList<>();
        int n = mat.length;
        int m = mat[0].length;

        // 1st half
        int i = 0;
        int j = 0;
        boolean flag = true;
        while (isPossible(i, j, n, m)) {
            if (flag) {
                while (isPossible(i, j, n, m)) {
                    ans.add(mat[i][j]);
                    i--;
                    j++;
                }
                i = 0;
            } else {
                while (isPossible(i, j, n, m)) {
                    ans.add(mat[i][j]);
                    i++;
                    j--;
                }
                j = 0;
            }
            flag = !flag;
        }

        // 2nd half
        if ((n & 1) != 0) {
            i = 1;
            j = m - 1;
            flag = false;
        } else {
            i = n - 1;
            j = 1;
            flag = true;
        }
        while (isPossible(i, j, n, m)) {
            if (flag) {
                while (isPossible(i, j, n, m)) {
                    ans.add(mat[i][j]);
                    i--;
                    j++;
                }
                i += 2;
                j--;
            } else {
                while (isPossible(i, j, n, m)) {
                    ans.add(mat[i][j]);
                    i++;
                    j--;
                }
                i--;
                j += 2;
            }
            flag = !flag;
        }
        
        // Convert List to int[]
        int[] result = new int[ans.size()];
        for (int k = 0; k < ans.size(); k++) {
            result[k] = ans.get(k);
        }
        return result;
    }
}
