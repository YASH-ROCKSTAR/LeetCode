class Solution {
    public int brokenCalc(int startValue, int target) {
        int ans=0;
        while(startValue<target){
            if(target%2==0){
                target=target/2;
            }else{
                target++;
            }
            ans++;
        }
        ans=ans+startValue-target;
        return ans;
    }
}