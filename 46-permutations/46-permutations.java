class Solution {
    public void func(int pos,int[] nums,List<List<Integer>> li){
        List<Integer> ds =new ArrayList<>();
        if(pos==nums.length){
            for(int i=0;i<nums.length;i++){
                ds.add(nums[i]);
            }
            li.add(new ArrayList<>(ds));
            // return;
        }
        for(int i=pos;i<nums.length;i++){
            swap(nums,pos,i);
            func(pos+1,nums,li);
            swap(nums,pos,i);
        }
    }
    public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> li=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        func(0,nums,li);
        return li;
    }
}