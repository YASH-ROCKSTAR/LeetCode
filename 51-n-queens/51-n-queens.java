class Solution {
    public List<List<String>> solveNQueens(int n) {
        boolean[][] board =new boolean[n][n];
        return Queen(board,0);
    }
    public List<List<String>> Queen(boolean[][] board,int row){
        if(row==board.length){
            return display(board);
        }
        List<List<String>> arr=new ArrayList<>();
        for(int col=0;col<board[0].length;col++){
            if(isSafe(board,row,col)){
                board[row][col]=true;
                arr.addAll(Queen(board,row+1));
                board[row][col]=false;
            }
        }
        return arr;
    }
    public static boolean isSafe(boolean[][] board, int row, int col) {
        //vertical row
        for(int i=0;i<row;i++){
            //cheking if queen is there then it is not safe
            if(board[i][col]){
                return false;
            }
        }
        //diagonal left
        int maxleft=Math.min(row,col);
        for(int i=1;i<=maxleft;i++){
            //if true
            if(board[row-i][col-i]){
                return false;
            }
        }
        //diagonal right
        int maxRight=Math.min(row, board.length-col-1);
        for(int i=1;i<=maxRight;i++){
            //if true
            if(board[row-i][col+i]){
                return false;
            }
        }
        //if none of checks are matched then true
        return true;
    }

    public List<List<String>> display(boolean[][] board) {
        List<List<String>> list = new ArrayList<>();
        List<String> sublist = new ArrayList<>();
        
        for (int r = 0; r < board.length; r++) {
            String x = "";
            for (int c = 0; c < board.length; c++) {
                if  (board[r][c]) {
                    x += "Q";
                } else {
                    x += ".";
                }
            }
            sublist.add(x);
        }
        list.add(sublist);
        return list;
    }
    
}