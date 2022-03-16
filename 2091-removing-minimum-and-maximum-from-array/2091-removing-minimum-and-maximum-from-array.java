class Solution {
    public int minimumDeletions(int[] nums) {
//         if(nums.length==1){
//             return 1;
//         }
//         int maxi=Integer.MIN_VALUE;
//         int mini=Integer.MAX_VALUE;
//         int minInd=0;
//         int maxInd=0;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]>maxi){
//                 maxi=nums[i];
//                 maxInd=i;
//             }
//             else if(nums[i]<mini){
//                 mini=nums[i];
//                 minInd=i;
//             }
//         }
//         int frontdelete=Math.max(minInd,maxInd)+1;
//         int lastdelete=nums.length-Math.min(minInd,maxInd);
//         int deletefrombothside=Math.min(minInd,maxInd) + nums.length - Math.max(minInd,maxInd) + 1;
        
//         return Math.min(frontdelete,Math.min(lastdelete,deletefrombothside));    
        if(nums.length == 1) return 1;

    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    
    int minIndex = 0;
    int maxIndex = 0;
    
    for(int i = 0; i < nums.length; ++i){
        int n = nums[i];
        
        if(n < min) {
            min = n;
            minIndex = i;
        }
        if(n > max) {
            max = n;
            maxIndex = i;
        }
    }
    
    int deleteFromFront = Math.max(minIndex,maxIndex) + 1;
    int deleteFromLast = nums.length - Math.min(minIndex,maxIndex);
    int deleteFromBothSide = Math.min(minIndex,maxIndex) + nums.length - Math.max(minIndex,maxIndex) + 1;
    
    return Math.min(deleteFromFront,Math.min(deleteFromLast,deleteFromBothSide));

    }
}