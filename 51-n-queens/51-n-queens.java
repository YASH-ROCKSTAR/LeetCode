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
            if(itisSafe(board,row,col)){
                board[row][col]=true;
                arr.addAll(Queen(board,row+1));
                board[row][col]=false;
            }
        }
        return arr;
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