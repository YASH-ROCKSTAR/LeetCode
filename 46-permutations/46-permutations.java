class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> li=new ArrayList<>();
        solve(nums,0,li);
        return li;
    }
    public void solve(int[] nums,int pos,List<List<Integer>> li){
        List<Integer> ans=new ArrayList<>();
        if(pos==nums.length){
            for(int i=0;i<nums.length;i++){
                ans.add(nums[i]);
            }
            li.add(ans);
        }
        for(int i=pos;i<nums.length;i++){
            swap(nums,pos,i);
            solve(nums,pos+1,li);
            swap(nums,pos,i);
        }
    }
    public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}