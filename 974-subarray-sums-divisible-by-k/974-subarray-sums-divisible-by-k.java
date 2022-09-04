class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        mp.put(0,1);
        int sum=0,count=0;
        for(int i:nums){
            sum=(sum+i)%k;
            if(sum<0){
                sum=sum+k;
            }
            count+=mp.getOrDefault(sum,0);
            mp.put(sum,mp.getOrDefault(sum,0)+1);
        }
        return count;
    }
}