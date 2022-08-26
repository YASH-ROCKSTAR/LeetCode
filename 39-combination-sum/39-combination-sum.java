class Solution {
    public void find(int ind,int[] arr,int target,List<List<Integer>> li,List<Integer> ds){
        if(ind==arr.length){
            if(target==0){
                li.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[ind]<=target){
            //picking an element
            ds.add(arr[ind]);
            find(ind,arr,target-arr[ind],li,ds);
            ds.remove(ds.size()-1);
        }
        //when not picking and element
        find(ind+1,arr,target,li,ds);
        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> ds=new ArrayList<>();
        List<List<Integer>> li=new ArrayList<>();
        find(0,candidates,target,li,ds);
        return li;
    }
}