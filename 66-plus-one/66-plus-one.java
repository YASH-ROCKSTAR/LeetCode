class Solution {
    public int[] plusOne(int[] digits) {
        int carry=1;
        int n=digits.length;
        for(int i=n-1;i>=0;i--){
            digits[i]=digits[i]+carry;
            if(digits[i]!=10){
                return digits;
            }
            digits[i]=0;
        }
        
        int[] a=new int[n+1];
        a[0]=1;
        return a;
    }
}