class Solution {
    public int numberOfSteps(int num) {
        int ans=num;
        int count=0;
        while(ans>0){
            if(ans%2==0){
                ans=ans/2;
            }else{
                ans=ans-1;
            }
            count++;
        }
        
        return count;
    }
}