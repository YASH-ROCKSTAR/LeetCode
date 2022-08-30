class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //length of col=3 
        int n=matrix.length;
        //length of row=4;
        int m=matrix[0].length;
        //if i=0
        int i=0;
        //if j=(3*4)-1
        int j=(n*m)-1;
        //while(0<=11)
        //mid=0+11/2=5
        //matrix[5%4][5%4]=matrix[1][1]=11
        //now 11==3 false
        //11<3 false so j=mid-1=4
        //so now i=0 and j=4
        //so now mid=2
        //so matrix[2/4][2%4]=matrix[0][2]=5 //let me clear how 2/4=0 so when we divided like 4|2| so 4*0=0 so 4|2-0=|2| so 0 is 2/4 and 2 is 2%4 
        //now 5==3 false , 5<=3 false so j=mid-1=3 , 
        //let me clear that when we divide and modulo a number that is less than from which we are dividing so in that case which is / mean 2/4 is always 0 and whatever is modulo that is that same which which is divide like 1%4 so it is 1 ,like 2%4 it is 2 
        //i=0 and j=3 mid=1 so now matrix[1/4][1%4]=mat[0][1]=3 so 3==target true
        while(i<=j){
            int mid=i+(j-i)/2;
            if(matrix[mid/m][mid%m]==target){
                return true;
            }else if(matrix[mid/m][mid%m]<=target){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        return false;
        
    }
}