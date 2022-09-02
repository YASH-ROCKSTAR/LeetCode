class Solution {
    public int maxChunksToSorted(int[] arr) {
        //it is very easy as we have to only tell that hownmay time its need to osrt the array 
        //so basically we have taken one max and count variable
        //getting max element by each loop iterating and checking whether thta element is equal to it index that number of count we have to return
        //if we take example first {4,3,2,1,0} so we have iterated and get 4 as max element now when for next time we iterate we will not get any element as it is max element
        //when we found that element is equal is to it index then we count as a largest chunk 
        
        //second example
        //{1,0,2,3,4} so first we get 1 as max element then at 1 index 1 is max theen 1==1 then count=1
        //in next time we reach to 2 index then we get 2 and 2==2 count=2 then at 3==3 count=3
        // then at 4==4 so count=4
        int max=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
            if(max==i){
                count++;
            }
        }
        return count;
    }
}