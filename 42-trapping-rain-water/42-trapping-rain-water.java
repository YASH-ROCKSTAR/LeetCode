class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int l=0;
        int r=n-1;
        int res=0;
        int leftmax=0;
        int rightmax=0;
        while(l<=r){
            //checking left is smaller thena right
            if(height[l]<=height[r]){
                
                //chekcing if height of l is greater than right then assign the value to it
                if(height[l]>=leftmax) leftmax=height[l];
                else res+=(leftmax-height[l]);
                
                l++;
            }else{
                if(height[r]>=rightmax) rightmax=height[r];
                else res+=(rightmax-height[r]);
                
                r--;
            }
        }
        return res;
    }
}