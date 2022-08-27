class Solution {
        //here question is saying that li will contian sum fro target
    //but the condition is that one element can be taken only once

    //no duplicate combination list

    //in combination-I we can take one element muliple time but in
    //combination-2 we have to take one element on time

    //this time instead of picking and not picking 
    //this time we wiil take subsequence

    //Ex-[1,1,1,2,2] target=4;
    //we will also check arr[ind]>target then break from there because furter index will also be not acceptablr
    //can we start with 0 index ,1 index ,2 index ,3 index,4 index
    //in this way we can start taking combination

    //f(0,4,{})
    //pick the element f(1,3,{1}) and other one camnnot be pick because

    //and then f(4,4-2=2,{2}) and other two cannot be there as they cannot be taken as first element 
    //and first element can be 1 and 2 only

    //now we option to choose 1,2,3,4 index and 0 index cannot be takebn
    //f(2,2,{1,1})
    //we cannot chose further element in this further call as a[ind]>=target
    //whenever taget==0 is caaled then this can be base case
    //now 2 ,3,4 index can be choosen 
    //f(3,2-1=1,{1,1,1})
    //3 index be choosen f(3,2-2=0,{1,1,2}}) 
    //we cannot chhose 4th as we have already choosen 2
    //now f(4,1,{1,2})
    //as it reaches 4 index and arr[ind]>taget
    //now we can pick 3 index 
    //f(4,3-2=1,{1,2}) and 4 index cannot be chosen

    //again when we call {4,2,{2}}
    //we go to f(5,0,{2,2}) so it cna be one of answer
    //now intial recursioncall is over
    //{1,1,2},{2,2} is answer
    //rule
    //f(ind,target,ds,ans)
    //so iteration start from 0 index it will go from 0 to last index 
    //in step call start from 1 index som from 1 to last index go omn
    //in next call start from 2 index to last
    //in 3index from 3 to last and so

    public void find(int ind,int[] arr,int target,List<List<Integer>> li,List<Integer> ds){
        //if target isd zero thn add that list in list of list
        if(target==0){
            li.add(new ArrayList<>(ds));
            return;
        }
        //starting from for loop from ind to arr.length
        for(int i=ind;i<arr.length;i++){
            //if i> ind and element at i is equal to perev element the  dont take that element 
            //and continue
            if(i>ind && arr[i]==arr[i-1]) continue;
            //if element at any index is greater than tragte then  break
            if(arr[i]>target) break;
            // /adding element in list
            ds.add(arr[i]);
            //and increrasing index on e by one as we acnniot taske duplicatge element
            find(i+1,arr,target-arr[i],li,ds);
            //and removeing last element and backtrack
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