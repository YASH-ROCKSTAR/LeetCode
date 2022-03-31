class Solution {
    public int splitArray(int[] nums, int m) {
        int mx = 0, sum = 0;

    for(int it : nums){
        mx = Math.max(mx,it);
        sum += it;
    }
    
    int lo = mx, hi = sum;
    int rs = 0;
    while(lo <= hi){
        
        int mid = lo + (hi - lo)/2;
        
        if(valid(nums,mid,m)){
            hi = mid-1;
            rs = mid;
        }
        else lo = mid+1;
    }

    return rs;

}
public static boolean valid(int[] arr, int mid, int m){
    
    int cnt = 1;
    int sum = 0;
    for(int i = 0; i < arr.length; i++){
        sum += arr[i];
        if(sum>mid){
            cnt++;
            sum = arr[i];
        }
        if(cnt > m) return false;
    }
    return true;
}
    
}