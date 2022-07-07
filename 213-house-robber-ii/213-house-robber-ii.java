class Solution {
     public int solve(int[] nums){
        int prev=nums[0];
         //deals with 0 ansd -1
        int prev2=0;
        
        for(int i=1;i<nums.length;i++){
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
    public int rob(int[] nums) {
        
        int n=nums.length;
        int[] temp1=new int[n];
        int[] temp2=new int[n];
        if(n==1) return nums[0];
        
        for(int i=0;i<n;i++){
            if(i!=0) temp1[i]=nums[i];
            if(i!=n-1) temp2[i]=nums[i];
            
        }
        return Math.max(solve(temp1),solve(temp2));
        
    }
}