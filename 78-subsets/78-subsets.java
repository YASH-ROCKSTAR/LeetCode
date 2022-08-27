class Solution {
    //so here we will talk about how we can make subset from given array
    //that is called power set of that array
    //priocess is that we have to take first element and putting all rest elemtn on it so to formed 
    //subset and we have to do so on like when we take 2 element then it will make set with 
    //2 elemenrt and after 2 only one element is there so one more element will be in subset
    // so it will make subet with 2 element 2 and last element (2, {2,3})
    //Taking example {1,2,3}
    //so firsly null set will be there so 
    //further when recrusion call will 
    //there so take and not take element
    // but it will increase index as it need unique elemern
    //so recrusion call will be there
    // when first recrsion call will be ther then {1,2,3} and {1,2} will be generated
    //and when it backtrack it goes to recrusion call f(1,num,{1}) and
    // call fir pcik and not pick
    // pick -f(2,num,{1,2})
    //goes to pick of f(3,num,{1,2,3}) 
    //not pick-f(3,num,{1,2})
    //her wit will backtact back and recusion call will be over
    // not pick-f(2,nums,{1})
    //pick-f(2,num,{1,2})
    //pick-f(3,num,{1,2,3})--from here it will return
    // not take will genrated f(3,{1,2})--from here it will return
    //npt pick-f(2,num,{1})
    //pick call not pick-f(3,num,{1,3})--from here it will return
    //not pick-f(3,num,{1})--from here it will return
    //now comes first not pick call that is f(1,num,{})
    //pick-f(2,num,{2})
    // pick of above f(3,num,{2,3})--from here it will return
    //not pick of above f(3,num,{2})--from here it will return
    // not pick-f(2,num,{})
    //pick above above -f(3,num,{3})--from here it will return
    //not pick =f(3,num,{})--from here it will return
    
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