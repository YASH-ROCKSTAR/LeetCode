class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[] next=new int[n+1];
        Arrays.fill(next,0);
        int[] curr=new int[n+1];
        Arrays.fill(curr,0);
        //no need to write base case as all array is fill with zero only
        for(int ind=n-1;ind>=0;ind--){
            // prev should be ind-1 because it should be always less than ind
            //prev>=-1 because when it doesnot have it prev element
            for(int prev=ind-1;prev>=-1;prev--){
                int len=0+next[prev+1];
                if(prev==-1 || nums[ind]>nums[prev]){
                    len=Math.max(len,1+next[ind+1]);
                } 
                curr[prev+1]=len;
            }
            next=curr;
            
        }
        return next[-1+1];
    }
}