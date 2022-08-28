class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        HashMap<Integer,PriorityQueue<Integer>> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                // so priortiy queue is putting eleemnt in order and 
                mp.putIfAbsent(i-j,new PriorityQueue<>());
                //getting eleemnt from map in sorted order 
                mp.get(i-j).add(mat[i][j]);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=mp.get(i-j).poll();
            }
        }
        return mat;
    }
}