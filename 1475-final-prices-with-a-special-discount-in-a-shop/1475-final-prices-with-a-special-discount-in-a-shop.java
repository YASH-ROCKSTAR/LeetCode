class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> ss=new Stack<Integer>();
        for(int i=0;i<prices.length;i++){
            while(!ss.isEmpty() && prices[i]<=prices[ss.peek()]){
                prices[ss.peek()]=prices[ss.peek()]-prices[i];
                ss.pop();
            }
            ss.push(i);
        }
        return prices;
    }
}