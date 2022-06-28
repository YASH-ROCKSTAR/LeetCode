class Solution {
    HashSet<List<Integer>> set;
    public void permu(int[] nums,int pos){
        List<Integer> li=new ArrayList<>();
        if(pos==nums.length){
            for(int i=0;i<nums.length;i++){
                li.add(nums[i]);
            }
            set.add(li);
        }
        for(int i=pos;i<nums.length;i++){
            swap(nums,pos,i);
            permu(nums,pos+1);
            swap(nums,pos,i);
            
        }
    }
    public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        set=new HashSet<>();
        permu(nums,0);
        List<List<Integer>> list=new ArrayList<>(set);
        return list;
    }
}