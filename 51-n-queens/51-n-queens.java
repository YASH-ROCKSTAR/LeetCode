class Solution {
    public List<List<String>> solveNQueens(int n) {
        boolean[][] board=new boolean[n][n];
        return Queen(board,0);
    }
    public boolean isSafe(boolean[][] board,int row,int col){
        
        //reason for not checking on right side of queen as we are not able to reaches there beacuse we are moving from backward whatever queen attack will be there it will be on left side
        
        //on upper diagonal bothe col and row will decrease 
        // upward diagonal on left side 
        for(int i=0;i<row;i++){
            if(board[i][col]){
                return false;
            }
        }
        int maxleft=Math.min(row,col);
        for(int i=1;i<=maxleft;i++){
            if(board[row-i][col-i]){
                return false;
            }
        }
        //lower diagonal which is on left side
        int maxright=Math.min(row,board.length-col-1);
        for(int i=1;i<=maxright;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
        
    }
    public List<List<String>> Queen(boolean[][] board,int row){
        //if row size reaches to board size then
        // add the queen to matrix
        if(row==board.length){
            return display(board);
        }
        
        List<List<String>> li=new ArrayList<>();
        //running a for loop for every column and row checking whether it is safe 
        //safe a function which tell if queen is not getting attacked by another queen in upper diagional ,left col ,and lower diagonal
        for(int col=0;col<board.length;col++){
            if(isSafe(board,row,col)){
                //is in a matrix if q ueen is safe it marked as true
                board[row][col]=true;
                //now calling for another row so row+1 in another list
                li.addAll(Queen(board,row+1));
                //and marking present row as false to backtract as wwe are now going to nextrow
                board[row][col]=false;
                
            }
            
        }
        return li;
    }
    public List<List<String>> display(boolean[][] board){
        List<List<String>> li=new ArrayList<>();
        List<String>arr=new ArrayList<>();
        for(int r=0;r<board.length;r++){
            String x="";
            for(int c=0;c<board.length;c++){
                if(board[r][c]){
                    x+="Q";
                }else{
                    x+=".";
                }
            }
            arr.add(x);
        }
        li.add(arr);
        return li;
    }
}