class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s=new HashSet<Integer>();
        for(int num:nums){
            s.add(num);
        }
        int longest=0;
        for(int num:nums){
            if(!s.contains(num-1)){
                int currentNum=num;
                int currentStreak=1;
                while(s.contains(currentNum+1)){
                    currentNum+=1;
                    currentStreak+=1;
                }
                longest=Math.max(longest,currentStreak);
            }
        }
        return longest;
    }
}