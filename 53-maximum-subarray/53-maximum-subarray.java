class Solution {
    public int maxSubArray(int[] a) {
        int sum=0;
        int maxi=a[0];
        for(int i:a){
            sum=sum+i;
            if(sum>maxi){
                maxi=sum;
            }if(sum<0){
                sum=0;
            }
        }return maxi;
    }
}