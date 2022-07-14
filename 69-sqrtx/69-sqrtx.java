class Solution {
    public int mySqrt(int x) {
        if(x<=1) return x;
        int l=1;
        int end=x-1;
        while(l<=end){
            int mid=l+(end-l)/2;
            
            if(mid==x/mid){
                return mid;
            }else if(mid<x/mid){
                l=mid+1;
            }else{
                end=mid-1;
            }
        }
        return end;
        
    }
}