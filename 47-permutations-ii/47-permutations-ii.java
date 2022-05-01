class Solution {
    HashSet<List<Integer>> set;
     public void recurpermit(int index,int[] nums){
       
        if(index==nums.length){
            List<Integer> ds=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                ds.add(nums[i]);
            }
            set.add(ds);
            return ;
        }
        for(int i=index;i<nums.length;i++){
            swap(i,index,nums);
            //next element pe jaye ke swap karne ke liye
            recurpermit(index+1,nums);
            //backtracking 
            swap(i,index,nums);
        }
    }
    private void swap(int i,int j,int[] nums){
        int t=nums[i];
        nums[i]= nums[j];
        nums[j]=t;
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        set=new HashSet<>();
        recurpermit(0,nums);
        List<List<Integer>> ans=new ArrayList<>(set);
        return ans;
    }
}