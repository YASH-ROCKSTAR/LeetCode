//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])throws IOException
    {
        //reading input using BufferedReader class
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        //reading total testcases
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            //reading number of elements and weight
            int n = Integer.parseInt(read.readLine());
            int w = Integer.parseInt(read.readLine());
            
            int val[] = new int[n];
            int wt[] = new int[n];
            
            String st[] = read.readLine().trim().split("\\s+");
            
            //inserting the values
            for(int i = 0; i < n; i++)
              val[i] = Integer.parseInt(st[i]);
             
            String s[] = read.readLine().trim().split("\\s+"); 
            
            //inserting the weigths
            for(int i = 0; i < n; i++)
              wt[i] = Integer.parseInt(s[i]);
              
            //calling method knapSack() of class Knapsack
            System.out.println(new Solution().knapSack(w, wt, val, n));
        }
    }
}




// } Driver Code Ends


class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         // your code here 
         return solve(wt,val,0,W,n,new HashMap<String,Integer>());
    } 
    public static int solve(int[] wt,int[] val,int current,int cap,int n,HashMap<String,Integer> mp){
        if(current==n){
            return 0;
        }
        int curwie=wt[current];
        int curpro=val[current];
        int take=0;
        String currentKey=Integer.toString(current)+"-"+Integer.toString(cap);
        if(mp.containsKey(currentKey)){
            return mp.get(currentKey);
        }
        if(curwie<=cap){
            take=curpro+solve(wt,val,current+1,cap-curwie,n,mp);
        }
        int nottake=solve(wt,val,current+1,cap,n,mp);
        mp.put(currentKey,Math.max(take,nottake));
        return mp.get(currentKey);
    }
}


