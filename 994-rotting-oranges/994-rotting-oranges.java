class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid==null ||grid.length==0){
            return 0;
        }
        int rows=grid.length;
        int column=grid[0].length;
        int count_fresh=0;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i , j});
                }
                if(grid[i][j]!=0){
                    //count no of orange
                    count_fresh++;
                }
            }
        }
        //countmin will take days and cnt will taken total rotten 
        if(count_fresh==0) return 0;
        int countmin=0,cnt=0;
        int[] dx={0,0,1,-1};
        int[] dy={1,-1,0,0};
        
        //bfs
        while(!q.isEmpty()){
            int size=q.size();
            cnt+=size;
            for(int i=0;i<size;i++){
                int[] point =q.poll();
                for(int j=0;j<4;j++){
                    int x=point[0]+dx[j];
                    int y=point[1]+dy[j];
                    
                    if(x<0 || y<0 || x>=rows || y>=column || grid[x][y]==0 || grid[x][y]==2) continue;
                    
                    grid[x][y]=2;
                    
                    q.offer(new int[]{x,y});
                }
            }
            if(q.size()!=0){
                countmin++;
            }
        }
        return count_fresh==cnt ? countmin :-1;
    }
}