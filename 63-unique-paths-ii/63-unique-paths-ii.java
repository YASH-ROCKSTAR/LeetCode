class Solution {
    public int uniquePathsWithObstacles(int[][] arr) {
        
        int m=arr.length;
        int n=arr[0].length;
        
//         int[][] dp=new int[m][n];
        
//         for(int[] row:dp){
//             Arrays.fill(row,-1);
//         }
        int[] prev=new int[m];
        for(int i=0;i<m;i++){
            int[] temp=new int[n];
            for(int j=0;j<n;j++){
                if(i>=0 && j>=0 && arr[i][j]==1){
                    temp[j]=0;
                    continue;
                }
                if(i==0 && j==0){
                    temp[j]=1;
                    continue;
                }
                int up=0;
                int left=0;

                if(i>0) up=prev[j];
                if(j>0) left=temp[j-1];;

                temp[j]=up+left;
            }
            prev=temp;
        }
        return prev[n-1];
    }
    
}