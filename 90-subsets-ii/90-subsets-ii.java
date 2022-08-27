class Solution {
    public void func(int ind,int[] nums,List<Integer> ds,List<List<Integer>> li){
        if(ind==nums.length){
            li.add(new ArrayList<>(ds));
            return;
        }
        ds.add(nums[ind]);
        func(ind+1,nums,ds,li);
        ds.remove(ds.size()-1);
        while(ind+1<nums.length && nums[ind]==nums[ind+1]) ind++; 
        func(ind+1,nums,ds,li);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> li=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        Arrays.sort(nums);
        func(0,nums,ds,li);
        return li;
    }
}