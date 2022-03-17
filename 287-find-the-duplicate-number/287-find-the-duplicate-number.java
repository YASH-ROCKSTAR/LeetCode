class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<Integer>();
        for(Integer i:nums){
            if(set.contains(i)){
                return i;
            }
            set.add(i);
        }
        return -1;
    }
}