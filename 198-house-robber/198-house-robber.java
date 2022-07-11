class Solution {
    
    public int rob(int[] nums) {
        int ind=nums.length;
        int prev=nums[0];
        int prev2=0;

        for(int i=1;i<ind;i++){
            int take=nums[i];
            if(i>1){
                take+=prev2;
            }
            int nottake=0+prev;
            
            int curri=Math.max(take,nottake);
            prev2=prev;
            prev=curri;
        }
        return prev;
    }
}