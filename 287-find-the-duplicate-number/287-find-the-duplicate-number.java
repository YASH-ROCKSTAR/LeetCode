class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> map=new HashSet<>();
        for(int i:nums){
            if(map.contains(i)){
                return i;
            }
            map.add(i);
        }
        return -1;
    }
}