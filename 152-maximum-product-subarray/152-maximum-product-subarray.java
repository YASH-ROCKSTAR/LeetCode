class Solution {
    public int maxProduct(int[] nums) {
        int max=0;
        int pro=1;
        if(nums.length==1){
            return nums[0];
        }
        for(int i=0;i<nums.length;i++){
            pro=pro*nums[i];
            max=Math.max(max,pro);
            if(pro==0){
                pro=1;
            }
        }
        pro=1;
        for(int i=nums.length-1;i>=0;i--){
            pro=pro*nums[i];
            max=Math.max(max,pro);
            if(pro==0){
                pro=1;
            }
        }
        return max;
    }
}