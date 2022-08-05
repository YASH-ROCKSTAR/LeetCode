class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hh=new HashMap<>();
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            sum=sum%k;
            if(sum==0 && i>0){
                return true;
            }
            if(hh.containsKey(sum) && i-hh.get(sum)>1){
                return true;
            }
            if(!hh.containsKey(sum)){
                hh.put(sum,i);
            }
            
        }
        return false;
    }
}