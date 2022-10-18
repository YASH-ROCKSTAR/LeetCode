//{ Driver Code Starts
import java.io.*;
import java.util.*;

class RodCutting {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            Solution ob = new Solution();
            System.out.println(ob.cutRod(arr, n));
        }
    }
}

// } Driver Code Ends


class Solution{
    public int cutRod(int price[], int n) {
        //code here\
        int[][] dp=new int[price.length][n+1];
        for(int[] i:dp){
            Arrays.fill(i,-1);
        }
        return solve(price,0,n,dp);
    }
    public int solve(int[] price,int current,int n,int[][] dp){
        if(n==0){
            return 0;
        }
        if(current>=price.length){
            return 0;
        }
        if(dp[current][n]!=-1){
            return dp[current][n];
        }
        int currentlength=current+1;
        int consider=0;
        if(currentlength<=n){
            consider=price[current]+solve(price,current,n-currentlength,dp);
        }
        int not=solve(price,current+1,n,dp);
        
        return dp[current][n]=Math.max(consider,not);
    }
}