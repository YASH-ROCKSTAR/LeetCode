class Solution {
    public void sortColors(int[] nums) {
    //     int low=0;
    //     int mid=0;
    //     int high=nums.length-1;
    //     while(mid<=high){
    //         if(nums[mid]==0){
    //             swap(nums,low,mid);
    //             mid++;
    //             low++;
    //         }
    //         else if(nums[mid]==1){
    //             mid++;
    //         }
    //         else{
    //             swap(nums,high,mid);
    //             high--;
    //             mid++;
    //         }
    //     }
    // }
    // public void swap(int[] arr,int i,int j){
    //     int temp=arr[i];
    //     arr[i]=arr[j];
    //     arr[j]=temp;
    // }
        int i=0, j=0, k=nums.length-1;
        
		//i-> 0's pointer, j-> 1's pointer, k->2's pointer
        while(j<=k){
            
			//if j is 0, lets swap with i'th index
            if(nums[j]==0)
            {
                swapColors(nums,i,j);
                i++;
                j++;
            }
			// if we see 1, lets just move forward
            else if(nums[j]==1)
                j++;
				
			//if we see a 2, lets swap with k'th index and not moving j bcz we don't know what value j holds after swap
            else{
                swapColors(nums,j,k);
                k--;
            }
        }
    }
    
    public void swapColors(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}