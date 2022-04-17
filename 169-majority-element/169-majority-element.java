class Solution {
    public int majorityElement(int[] nums) {
        int ele=0;
        int count=0;
        for(int i:nums){
            if(count==0){
                ele=i;
            }if(i==ele){
                count=count+1;
            }else{
                count=count-1;
            }
        }
        return ele;
    }
}