class Solution {
    public void fun(int ind,int[] num,List<Integer> ds,List<List<Integer>> li){
       if(ind==num.length){
           li.add(new ArrayList<>(ds));
           return;
       }
       ds.add(num[ind]);
       fun(ind+1,num,ds,li);
       ds.remove(ds.size()-1);
       fun(ind+1,num,ds,li);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> li=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        fun(0,nums,ds,li);
        return li;
        
    }
    
}