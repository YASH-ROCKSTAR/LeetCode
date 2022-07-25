class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int maxi=0;
        for(int i=1;i<prices.length;i++){
            if(i>=0){
                int cost=prices[i]-prices[i-1];
                if(cost>0)
                    profit+=cost;
            }
        }
        return profit;
    }
}