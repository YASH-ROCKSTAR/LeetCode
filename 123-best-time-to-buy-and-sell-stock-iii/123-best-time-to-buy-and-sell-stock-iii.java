class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        if(n==0){
            return 0;
        }
        int[] left=new int[n];
        int[] right=new int[n];
        //bidirectional dp
        //left to right traversal
        int min=prices[0];
        for(int i=1;i<n;i++){
            //update the buy prices
            if(prices[i]<min)
                min=prices[i];
            //calculate current profit
            int profit=prices[i]-min;
            //fill
            left[i]=Math.max(left[i-1],profit);
        }
        //right to left
        int max=prices[n-1];
        for(int i=n-2;i>=0;i--){
            //update sell prices
            if(prices[i]>max)
                max=prices[i];
            int profit=max-prices[i];
            
            //update right
            right[i]=Math.max(right[i+1],profit);
        }
        int maxprofit=0;
        for(int i=0;i<n;i++){
            maxprofit=Math.max(maxprofit,left[i]+right[i]);
        }
        return maxprofit;
    }
}