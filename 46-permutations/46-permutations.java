class Solution {
    public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> ans=new ArrayList<>();
        permu(nums,0,ans);
        return ans;
    }
    public void permu(int[] nums,int pos,List<List<Integer>> ans){
        List<Integer> li=new ArrayList<>();
        if(pos==nums.length){
            for(int i=0;i<nums.length;i++){
                li.add(nums[i]);
            }
            ans.add(li);
        }
        for(int i=pos;i<nums.length;i++){
            swap(nums,pos,i);
            permu(nums,pos+1,ans);
            swap(nums,pos,i);
        }
    }
    public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    
}