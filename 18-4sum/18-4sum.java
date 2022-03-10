class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(i!=0 && nums[i]==nums[i-1])
                continue;
            for(int j=i+1;j<n;j++){
                if(j!=i+1 && nums[j]==nums[j-1])
                    continue;
                int s=j+1;
                int e=n-1;
                while(s<e){
                    if(nums[i]+nums[j]+nums[s]+nums[e]<target)
                        s++;
                    else if(nums[i]+nums[j]+nums[s]+nums[e]>target)
                        e--;
                    else{
                        ans.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[s],nums[e])));
                        s++;
                        e--;
                        while(s<e && nums[s]==nums[s-1])
                            s++;
                        while(s<e && nums[e]==nums[e+1])
                            e--;
                    }
                }
            }
        }
        return ans;
    }
}
