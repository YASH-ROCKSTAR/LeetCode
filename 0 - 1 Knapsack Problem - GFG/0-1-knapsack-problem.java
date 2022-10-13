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
    static int knapSack(int capa, int wt[], int val[], int n) 
    { 
         return solve(wt,val,0,capa,n,new HashMap<String,Integer>());
    } 
    public static int solve(int[] wt,int[] val,int current,int capa,int n,HashMap<String,Integer> mp){
        if(current==n){
            return 0;
        }
        int currentweight=wt[current];
        int currentprofit=val[current];
        String currentkey=Integer.toString(current) + "-" + Integer.toString(capa);
        if(mp.containsKey(currentkey)){
            return mp.get(currentkey);
        }
        int take=0;
        if(currentweight<=capa){
            take=currentprofit+solve(wt,val,current+1,capa-currentweight,n,mp);
        }
        int nottake=solve(wt,val,current+1,capa,n,mp);
        mp.put(currentkey,Math.max(take,nottake));
        return mp.get(currentkey);
    }
    
}


