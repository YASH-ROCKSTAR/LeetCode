class Solution {
    public int[][] generateMatrix(int n) {
        int left=0,right=n-1,down=n-1,up=0;
        int[][] mat=new int[n][n];
        int count=1;
        while(left<=right && up<=down){
            for(int i=left;i<=right;i++){
                mat[up][i]=count++;
            }
            up++;
            
            for(int i=up;i<=down;i++){
                mat[i][right]=count++;
            }
            right--;
            
            for(int i=right;i>=left;i--){
                mat[down][i]=count++;
            }
            down--;
            for(int i=down;i>=up;i--){
                mat[i][left]=count++;
            }
            left++;
        }
        return mat;
    }
}