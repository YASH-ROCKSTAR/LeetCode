class Solution {
    public int search(int[] nums, int target) {
        int ans=binary(nums,0,nums.length-1,target);
        return ans;
    }
    public  int binary(int[] arr,int start,int end,int target){
        //element not found
        if(start>end){
            return -1;
        }

        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]<target){
           return binary(arr,mid+1,end,target);
        }
        else{
            return binary(arr,start,mid-1,target);
        }
    }
}