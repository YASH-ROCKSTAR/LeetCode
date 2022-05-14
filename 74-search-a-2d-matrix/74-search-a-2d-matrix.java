class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int i=0;
        int j=(n*m)-1;
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