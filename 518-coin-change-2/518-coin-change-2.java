class Solution {
    
    public int change(int amount, int[] coins) {
        int n=coins.length;
        // int[][] dp=new int[n][amount+1];
        int[] prev=new int[amount+1];
        int[] curr=new int[amount+1];
        for(int i=0;i<=amount;i++){
            if(i%coins[0]==0){
                prev[i]=1;
            }
        }
        for(int ind=1;ind<n;ind++){
            for(int tar=0;tar<=amount;tar++){
                int take=0;
                int not=prev[tar];
                if(coins[ind]<=tar){
                    take=curr[tar-coins[ind]];
                }
                curr[tar]=take+not;
            }
            prev=curr;
        }
        return prev[amount];
    }
}