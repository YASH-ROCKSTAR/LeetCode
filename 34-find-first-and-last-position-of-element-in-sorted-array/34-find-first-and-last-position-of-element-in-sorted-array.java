class Solution {
    public int[] searchRange(int[] nums, int key) {
        int start=0;
        int end=nums.length-1;
        
        int mid=start+(end-start)/2;
        
        int[] ans=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        
        
        while(start<=end){//first occurence
            mid=start+(end-start)/2;
            if(nums[mid]==key){
                ans[0]=mid;
                end=mid-1;
            }
            else if(nums[mid]>key){
                end=mid-1;    
            }
            //right
            else if(nums[mid]<key){
                start=mid+1;
            }
            
        }
        start=0;
        end=nums.length-1;
        
        mid=start+(end-start)/2;
        while(start<=end){ //last occurence
            mid=start+(end-start)/2;
            if(nums[mid]==key){
                ans[1]=mid;
                start=mid+1;
            }
            else if(nums[mid]>key){
                end=mid-1;    
            }
            //right
            else if(nums[mid]<key){
                start=mid+1;
            }
        }
        return ans;
    }
}