class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int ans=0;
        int max=0;
        int curr=0;
        for(int i=0;i<nums.length-1;i++){
            curr=Math.max(curr,i+nums[i]);
            
            if(i==max){
                ans++;
                max=curr;
            }
        }
        return ans;
        
    }
}