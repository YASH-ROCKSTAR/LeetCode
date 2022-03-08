class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr==null || arr.length<3){
            return false;
        }
        int n=arr.length;
        int l=0;
        int r=n-1;
        while(l<n-1){
            if(arr[l]<arr[l+1]){
                l++;
            }
            else{
                break;
            }
        }
        if(l==n-1) return false; // strictly increasing
        while(r>0){
            if(arr[r]<arr[r-1]){
                r--;
            }else{
                break;
            }
        }
        if(r==0) return false; // strictly decreasing
        
        return l==r;
    }
}