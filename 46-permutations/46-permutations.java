class Solution {
    public void func(int pos,int[] nums,List<List<Integer>> li){
        //creating list for dtoring permutation
        List<Integer> ds =new ArrayList<>();
        //if pos of index reaches to nums.length thrn add number to list
        if(pos==nums.length){
            //reun for loop till nums.length
            for(int i=0;i<nums.length;i++){
                ds.add(nums[i]);
            }
            //adding in list of list
            li.add(new ArrayList<>(ds));
            // return;
        }
        //when when come by taking example
        //ex-{1,2,3}
        //when index remain on same index then swap 1 with 1 - list -{1,2,3} then add increase index by 1 to 
        //swap 1 with 2 and list will be (2,1,3) and for third index it will be {3,1,2}
        //now it comes to gain 1,2,3 when again call for second index of 1,2,3 then swap 2-2 and it will be {1,2,3} index+1 and then one side index+1 and reaxhes to 3 swap 3 and 2 - {1,3,2}
        //so now it reahes to 3 index and it last index so it will swap 3-3 and it will ve {1,2,3}
        //and {1,3,2} remain {1,3,2} because it swap 2 and 2
        // now it now back and recursion call be over 
        // now it goes to {2,1,3} then now it is on second index firstly swap same index 1-1 -{2,1,3}
        //now swap 3 index with 3 and 1 so it become {2,3,1}
        //now it {2,1,3} is on third index swap itself and swap third value of {2,3,1}
        //again return and go on 3 call that is {3,1,2} and same thing happen generate permutataion like this 
        for(int i=pos;i<nums.length;i++){
            swap(nums,pos,i);
            func(pos+1,nums,li);
            swap(nums,pos,i);
        }
    }
    public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> li=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        func(0,nums,li);
        return li;
    }
}