class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> subsets(int[] nums) {
        ans=new ArrayList();
        
        if(nums==null ||nums.length==0) return ans;
        solve(nums,new ArrayList<>(),0);
        return ans;
    }
    public void solve(int[] nums,ArrayList<Integer> out,int index){
       
        if(index>=nums.length){
            ans.add(new ArrayList<>(out));
            return;
        }
         //include
        out.add(nums[index]);
        solve(nums,out,index+1);
        out.remove(out.size()-1);
        
        //exclude
        solve(nums,out,index+1);
    }
}