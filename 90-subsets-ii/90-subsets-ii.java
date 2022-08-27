class Solution {
    //here we also have to use duplicate as list subset 
    //can also contian duplicate element 
    //so it there are duplicate in series then  we have to dont take that element in series 
    //again in that level
    //letsd take exaple arr={1,2,2,2,3,3}
    //at 0 level we generated null list
    //so when fun(0,{}) is called 
    //at first level we genrated all element contining one element
    //then f(1,{1}) ,f(2,{2}) --so when further it will go in index then 3 is coming so skip 2 and now again 4 index comes skip 2 
    //and 5 index come f(5,3) we will take 

    //then we call for second level
    //f(2,{1,2}) and again we cannot same element at same level skiiping 2
    //f(5,{1,3}) will be generated

    //it goes to from furtger call of f(2,{2}) --- f(3,{2,2}) anf skipping 2 f(5,{2,3})

    //now further call from f(5,{3})
    //so call f(6,{3,3})

    //now call for third level
    //it will contain three element
    //call for f(2,{1,2}) --f(3,{1,1,2}) so now skipping rest 2 now f(5,{,1,2,3})
    // now call deom f(5,{1,3}) and it has call f(6,{1,3,3})
    public void func(int ind,int[] nums,List<Integer> ds,List<List<Integer>> li){
        //if(ind reaches to length of nums)
        if(ind==nums.length){
            //add that subset into list od list
            li.add(new ArrayList<>(ds));
            return;
        }
        //adding element into lsit
        ds.add(nums[ind]);
        //and increasing the index value
        func(ind+1,nums,ds,li);
        ds.remove(ds.size()-1);
        //this is used tyo skip the duplicate element baecuse at same level we cannot take element 
        //more than once
        while(ind+1<nums.length && nums[ind]==nums[ind+1]) ind++; 
        //then  adding next element
        func(ind+1,nums,ds,li);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> li=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        Arrays.sort(nums);
        func(0,nums,ds,li);
        return li;
    }
}