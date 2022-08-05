class Solution {
    public void sortColors(int[] nums) {
        int start=0;
        int mid=0;
        int end=nums.length-1;
        while(mid<=end){
            if(nums[mid]==0){
                swap(mid,start,nums);
                start++;
                mid++;
                
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(mid,end,nums);
                end--;
            }
        }
    }
    public void swap(int i,int j,int[] arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}