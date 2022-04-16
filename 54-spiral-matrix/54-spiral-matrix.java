class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res=new ArrayList<>();
        if(matrix.length==0 || matrix[0].length==0){
            return res;
        }
        int rowbeg=0;
        int rowend=matrix.length-1;
        int colbeg=0;
        int colend=matrix[0].length-1;
        while(rowbeg<=rowend && colbeg<=colend){
            //trverse right
            for(int i=colbeg;i<=colend;i++){
                res.add(matrix[rowbeg][i]);
            }
            rowbeg++;
            
            //traverse down
            for(int j=rowbeg;j<=rowend;j++){
                res.add(matrix[j][colend]);
            }
            colend--;
            
            if(rowbeg<=rowend){
                for(int i=colend;i>=colbeg;i--){
                    res.add(matrix[rowend][i]);
                }
                rowend--;
            }
            if(colbeg<=colend){
                for(int j=rowend;j>=rowbeg;j--){
                    res.add(matrix[j][colbeg]);
                }
                colbeg++;
            }
        }
        return res;     
    }
}