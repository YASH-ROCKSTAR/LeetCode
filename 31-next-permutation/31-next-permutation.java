class Solution {
    public void nextPermutation(int[] nums) {
        int i=nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1]) i--;   //find first ith that break descending order
        if(i>=0){               //if it is not entirely descending
            int j=nums.length-1;    // starting from end
            while(nums[j]<=nums[i]) j--;   //finding right most largest element
            swap(nums,i,j);
        }
        reverse(nums,i+1,nums.length-1);
        
    }
    public void swap(int[] A,int i,int j){
        int temp=A[i];
        A[i]=A[j];
        A[j]=temp;
    }
    public void reverse(int[] nums,int i,int j){
        while(i<j){
            swap(nums,i++,j--);
        }
    }
}