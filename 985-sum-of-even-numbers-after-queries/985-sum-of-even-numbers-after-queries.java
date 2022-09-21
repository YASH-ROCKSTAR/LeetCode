class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int evensum=0,n=queries.length;
        for(int x:nums){
            if(x%2==0)
                evensum+=x;
        }
        int[] arr=new int[n];
        
        
        for(int i=0;i<n;i++){
            int val=queries[i][0] ,ind=queries[i][1];
            
            if(nums[ind]%2==0) evensum-=nums[ind];
            nums[ind]+=val;
            
            if(nums[ind]%2==0) evensum+=nums[ind];
            
            arr[i]=evensum;
        }
        return arr;
    }
}