class Solution {
    public boolean isValidSudoku(char[][] board) {
        return solve(board);
    }
    
    public boolean solve(char[][] board){
        boolean ans=true;
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    char c=board[i][j];
                    board[i][j]='.';
                    ans=isValid(board,i,j,c);
                    board[i][j]=c;
                    
                }
                if(!ans){
                    return ans;
                }
            }
        }
        return true;
    }
    
    boolean isValid(char[][] board,int row,int col,char c){
        for(int i=0;i<9;i++){
            //each column
            //checking same value is present or not if present return false
            if(board[i][col]==c){
                return false;
            }
            if(board[row][i]==c){
                return false;
            }
            if(board[3*(row/3) + i/3][3*(col/3)+i%3]==c){
                return false;
            }
        }
        return true;
    }
}