//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String line1[] = in.readLine().trim().split("\\s+");
            int N = Integer.parseInt(line1[0]);
            int W = Integer.parseInt(line1[1]);
            String line2[] = in.readLine().trim().split("\\s+");
            int val[] = new int[N];
            for(int i = 0;i < N;i++)
                val[i] = Integer.parseInt(line2[i]);
            String line3[] = in.readLine().trim().split("\\s+");
            int wt[] = new int[N];
            for(int i = 0;i < N;i++)
                wt[i] = Integer.parseInt(line3[i]);
                
            Solution ob = new Solution();
            System.out.println(ob.knapSack(N, W, val, wt));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int knapSack(int N, int W, int val[], int wt[])
    {    // code here
        int[][] dp=new int[N][W+1];
        for(int[] i:dp){
            Arrays.fill(i,-1);
        }
        return solve(wt,val,0,W,N,dp);
    }
    static int solve(int[] wt,int[] val,int current,int capacity,int n,int[][] dp){
        if(capacity==0){
            return 0;
        }
        if(current==n){
            return 0;
        }
        int currentweig=wt[current];
        int currentprof=val[current];
        
        // String currentkey=Integer.toString(current)+"-"+Integer.toString(capacity);
        if(dp[current][capacity]!=-1){
            return dp[current][capacity];
        }
        
        int consider=0;
        if(currentweig<=capacity){
            consider=currentprof+solve(wt,val,current,capacity-currentweig,n,dp);
        }
        int notconsi=solve(wt,val,current+1,capacity,n,dp);
        dp[current][capacity]=Math.max(consider,notconsi);
        return dp[current][capacity];
    }
    
}