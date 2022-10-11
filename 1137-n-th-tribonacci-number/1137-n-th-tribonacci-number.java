class Solution {
    public int tribonacci(int n) {
        return solve(n,new HashMap<>());
    }
    public int solve(int n,HashMap<Integer,Integer> mp){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 1;
        }
        int current=n;
        if(mp.containsKey(current)){
            return mp.get(current);
        }
        int a=solve(n-1,mp);
        int b=solve(n-2,mp);
        int c=solve(n-3,mp);
        mp.put(current,a+b+c);
        return a+b+c;
    }
}