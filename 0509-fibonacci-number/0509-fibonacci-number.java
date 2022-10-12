class Solution {
    public int fib(int n){
        return solve(n,new HashMap<Integer,Integer>());
    }
    public int solve(int n,HashMap<Integer,Integer> mp){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int current=n;
        if(mp.containsKey(current)){
            mp.get(current);
        }
        int a=solve(n-1,mp);
        int b=solve(n-2,mp);
        mp.put(current,a+b);
        return a+b;
        
    }
}