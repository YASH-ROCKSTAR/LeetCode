class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
       int[] res = new int[k];
        int idx = 0;
        int rows = mat.length, cols = mat[0].length;
        
        for (int c = 0; c < cols; c++) {
            for (int r = 0; r < rows && idx < k; r++) {
				//if this is soldier we can skip this row for now
                if (mat[r][c] == 1) {
                    continue;
                }
				//if this is first time we see 0 for this row we put the row to result
                if (c == 0 || mat[r][c - 1] == 1) {
                    res[idx++] = r;
                }
            }
        }
        //checking all soldiers rows
        if (idx < k) {
            for (int r = 0; r < rows && idx < k; r++) {
                if (mat[r][cols - 1] == 1) {
                    res[idx++] = r;
                }
            }
        }
        
        return res;
    }
}