//{ Driver Code Starts
import java.util.Scanner;
import java.lang.Math;

class Convert_To_Five {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            System.out.println(new GfG().convertfive(N));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG {
    int convertfive(int num) {
        int r=0;
        int y=1;
        while(num>9){
            int x=num%10;
            if(x==0){
                r=r+(5*y);
            }else{
                r=r+(x*y);
            }
            num/=10;
            y*=10;
        }
        if(num==0){
            return r+(5*y);
        }else{
            return r+(num*y);
        }
    }
}
