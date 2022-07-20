class Solution {
    public int mySqrt(int x) {
        if(x<=1) return x;
        int s=1;
        int e=x-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(mid==x/mid){
                return mid;
            }if(mid<x/mid){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return e;
    }
}