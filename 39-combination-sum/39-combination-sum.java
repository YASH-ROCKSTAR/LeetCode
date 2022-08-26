class Solution {
    
    // this problem will be solved using recursion
//     here array is given target is given and 
//     we have to find raay that cotnains that target sum wuith incluidng elemtn
//     one elemnt can use multiple time

//     arr=[2,3,6,7] target=7;

//     pick and non-pick
//     pick - 2,2,3
//     not picking-6,7

//     pick-7;
//     not pick-2,3,6

//     we always go to this procedure when we have to do question like this

//     li wiil contian elemnt fro target sum
//     func(0,7,li) - pick and non pick

//     question stated that single element can be taken multiple time so
//     pick-f(0,7-2,{2})-fun(0,5,{2})

//     //when we not picking element we will increase index by 1
//     not pick-fun(1,7,{})


//     f(0,5,{2}) 
//     pick - f(0,5-2,{2,2})-fun(0,3,{2,2})
//     not pick-fun(1,5,{2})

//     fun(0,3,{2,2})
//     pick-f(0,3-2,{2,2,2})
//     not pick-f(1,3,{2,2})

//     f(0,1,{2,2,2}) 
//     pick-not able to pick as target value 1<picking elemt 2 so cannot proceed

//     not pick={1,1,{2,2,2}}

//     f(1,1,{2,2,2})
//     pick=cannot pick again as target(1) <arr[ind](2)

//     not pick={3,1,{2,2,2}}
//     pick-not able to pick same as above
//     //not pick-fun(4,1,{2,2,2}) //as index value is increased so we wiil not call nothing
//     //and combination is also not valid
//     start backtact from last from f(4,1,{2,2,2}) to f(1,1,{2,.2,2})

//     starting backtract from f(0,1,{2,2,2})
//     and remove 2 from it and erase all backtract position
//     so now f(1,3,{2,2})
//     pick-{1,0,{2,2,3}} 

//     f(1,0,{2,2,3})
//     pick -not able to pickas targte is zero
//     not pick-f(2,0,{2,2,3}) and so on till f(4,0{2,2,3}) for not pick
//      insert element {2,2,3} and then only we will go to another condition

//     //before picking checking check ar[ind]<=target
//     and ind==n
//     if(target==0){
//         add array into list
//     }
//     from here we backtrack and goes into another 
//     not pick call which was call in starting

//     Tc-2^t*k
//     as every element has ability to call multiple time so 2^t 
//     and putting the k length size li into another list
//     Sc-complete on number of operation (k*x)

    public void find(int ind,int[] arr,int target,List<List<Integer>> li,List<Integer> ds){
        //so question talk about that we have to retrun list whose sum is equal to 
        //target sum and base condition for that is is ind reaches arr.length then recursion call will be end and if target result to zero then add that li tol list of lsit 
        if(ind==arr.length){
            if(target==0){
                li.add(new ArrayList<>(ds));
            }
            return;
        }
        //here checking that if target at amn stage is left is less than the element at 
        //given index then add the element in list and do not increase the ind as we can take elemt multiple times so call th function 
        // after when rexrsion is completed then removing the element from it for backtracking 
        if(arr[ind]<=target){
            //picking an element
            ds.add(arr[ind]);
            find(ind,arr,target-arr[ind],li,ds);
            ds.remove(ds.size()-1);
        }
        //here come when we are not picking the element from then index will be increase
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