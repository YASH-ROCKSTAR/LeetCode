class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            sum=sum%k;
            if(sum==0 && i>0){
                return true;
            }
            if(mp.containsKey(sum) && (i-mp.get(sum))>1){
                return true;
            }
            if(!mp.containsKey(sum)){
                mp.put(sum,i);
            }
        }
        return false;
    }
}