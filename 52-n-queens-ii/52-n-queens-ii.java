class Solution {
    public int totalNQueens(int n) {
        boolean[][] board =new boolean[n][n];
        int ans=Queen(board,0);
        return ans;
        
    }
     public int Queen(boolean[][] board,int row){
        if(row==board.length){
            return 1;
        }
         int count=0;
        for(int col=0;col<board[0].length;col++){
            if(itisSafe(board,row,col)){
                board[row][col]=true;
                count=count+Queen(board,row+1);
                board[row][col]=false;
            }
        }
         return count;
        
    }
    public boolean itisSafe(boolean[][] board,int row,int col){
        //vertical col
        int r=row;
        while(r>=0){
            if(board[r][col]==true){
                return false;
            }
            r--;
        }
        //diagonal left
        r=row;
        int c=col;
        while(r>=0 && c>=0){
            if(board[r][c]==true){
                return false;
            }
            r--;
            c--;
        }
        r=row;
        c=col;
        while(r>=0 && c<board[0].length){
            if(board[r][c]==true){
                return false;
            }
            r--;
            c++;
        }
        return true;
    }
}