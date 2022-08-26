class Solution {
    public void find(int ind,int[] arr,int target,List<List<Integer>> li,List<Integer> ds){
        if(target==0){
            li.add(new ArrayList<>(ds));
            return;
        }
        for(int i=ind;i<arr.length;i++){
            if(i>ind && arr[i]==arr[i-1]) continue;
            if(arr[i]>target) break;
            ds.add(arr[i]);
            find(i+1,arr,target-arr[i],li,ds);
            ds.remove(ds.size()-1);   
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> li=new ArrayList<>();
        Arrays.sort(candidates);
        find(0,candidates,target,li,new ArrayList<>());
        return li;
    }
}