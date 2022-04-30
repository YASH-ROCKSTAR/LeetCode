// { Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String> ans=new ArrayList<>();
        int[][] visited=new int[n][n];
        //making vivted matrix 0
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                visited[i][j]=0;
            }
        }
        if(m[0][0]==1) solve(0,0,m,n,ans,"",visited);
        return ans;
    }
    public static void solve(int i, int j,int[][] arr,int n,ArrayList<String> ans,String move
    ,int[][] visited){
        if(i==n-1 && j==n-1){
            ans.add(move);
            return;
        }
        //down
        if(i+1<n && visited[i+1][j]==0 && arr[i+1][j]==1){
            visited[i][j]=1;
            solve(i+1,j,arr,n,ans,move+"D",visited);
            visited[i][j]=0;
        }
        //left
        if(j-1>=0 && visited[i][j-1]==0 && arr[i][j-1]==1){
            visited[i][j]=1;
            solve(i,j-1,arr,n,ans,move+"L",visited);
            visited[i][j]=0;
        }
        //right
        if(j+1<n && visited[i][j+1]==0 && arr[i][j+1]==1){
            visited[i][j]=1;
            solve(i,j+1,arr,n,ans,move+"R",visited);
            visited[i][j]=0;
        }
        //upward
        if(i-1>=0 && visited[i-1][j]==0 && arr[i-1][j]==1){
            visited[i][j]=1;
            solve(i-1,j,arr,n,ans,move+"U",visited);
            visited[i][j]=0;
        }
    }
}