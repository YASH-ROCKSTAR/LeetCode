class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        if(temp<0){
            return false;
        }
        int rev=0;
        while(temp>0){
            int rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        if(x==rev){
            return true;
        }
        return false;
    }
}