class Solution {
    public int numberOfMatches(int n) {
        int total=0;
        int mat=0;
        while(n>=2){
            if(n%2==0){
                mat=n/2;
                n=n/2;
            }else{
                mat=(n-1)/2;
                n=(n-1)/2+1;
            }
            total+=mat;
        }
        return total;
    }
}