class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length<2){
            return false;
        }
        Set<Integer> map=new HashSet<>();
        for(int i:nums){
            if(map.contains(i)){
                return true;
            }   
            map.add(i);
        }
        return false;
    }
}