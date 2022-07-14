class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int n=Math.abs(nums[i]);
            if(nums[n-1]>0){
                nums[n-1]=-1*nums[n-1];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                li.add(i+1);
            }
        }
        return li;
    }
}