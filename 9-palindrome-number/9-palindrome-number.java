class Solution {
    public boolean isPalindrome(int x) {
        // int temp=x;
        // if(temp<0){
        //     return false;
        // }
        // int res=0;
        // while(temp>0){
        //     int rem=temp%10;
        //     res=res*10+rem;
        //     temp=temp/10;
        // }
        // if(x==res){
        //     return true;
        // }
        // return false;
        int temp=x;
        if(temp<0){
            return false;
        }
        int res=0;
        while(temp>0){
            int rem=temp%10;
            res=res*10+rem;
            temp=temp/10;
        }
        if(x==res){
            return true;
        }
        return false;
    }
}
