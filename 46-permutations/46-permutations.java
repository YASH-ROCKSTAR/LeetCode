class Solution {
    public void func(int[] nums,List<Integer> ds,List<List<Integer>> li,boolean[] freq){
        //so if nums length == list size so add that list in list of list
        if(nums.length==ds.size()){
            li.add(new ArrayList<>(ds));
            return;
        }
        //run a for loop in array and if
        // freq array is not visisted 
        for(int i=0;i<nums.length;i++){
            
            if(!freq[i]){
                //then marked it as true
                freq[i]=true;
                //add in list
                ds.add(nums[i]);
                // call the function
                func(nums,ds,li,freq);
                //and removing that element when we go abck after the end call 
                ds.remove(ds.size()-1);
                //removing the element from list
                //also marking not visited in freq array
                freq[i]=false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> li=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        boolean[] freq=new boolean[nums.length];
        func(nums,ds,li,freq);
        return li;
    }
}