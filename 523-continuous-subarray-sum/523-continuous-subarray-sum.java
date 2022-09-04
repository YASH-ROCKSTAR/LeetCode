class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        //so question says that if it has subaaray sum that is always a multiple of k
        //otherwise false
        //so we take hashmap to store value of sum at ith position
        //so we add sum to the and check if is multipleof k by dividing by k 
        //if sum ==0 and check i>0 then it is true 
        //another condition is if we contains sum in map and ig i-mp.get(sum)->value >1(checking the length is greater than 1 as it is said atleast size should be two) so it is true
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