class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int max=0,count=0;
        int i=0;
        int j=tokens.length-1;
        while(i<=j){
            if(power>=tokens[i]){
                count++;
                max=Math.max(max,count);
                power=power-tokens[i++];
                
            }else if(count>0){
                count--;
                power=power+tokens[j--];
                
            }else{
                return max;
            }
            
        }
        return max;
    }
}