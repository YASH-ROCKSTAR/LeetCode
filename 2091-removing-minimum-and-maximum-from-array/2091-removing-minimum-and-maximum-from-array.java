class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int minInd=0;
        int maxInd=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                maxInd=i;
            }
            if(nums[i]<min){
                min=nums[i];
                minInd=i;
            }
        }
        int deletefront=Math.max(minInd,maxInd)+1;
        int deletelast=nums.length-Math.min(minInd,maxInd);
        int deletefrombothside=Math.min(minInd,maxInd)+nums.length-Math.max(minInd,maxInd)+1;
        
        return Math.min(deletefront,Math.min(deletelast,deletefrombothside));
    }
}