class Solution {
    public int subarraysDivByK(int[] A, int K) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        mp.put(0,1);
        int sum=0;
        int count=0;
        for(int i:A){
            sum=(sum+i)%K;
            if(sum<0) sum=sum+K;
            count+=mp.getOrDefault(sum,0);
            mp.put(sum,mp.getOrDefault(sum,0)+1);
        }
        return count;
    }
}