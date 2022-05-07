class Solution {
    public int maximalRectangle(char[][] matrix) {
        int currow[]=new int[matrix[0].length];
        int maxArea=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]=='0'){
                    currow[j]=0;
                }else{
                    currow[j]+=1;
                }
                
            }
            maxArea=Math.max(maxArea,largestRectangleArea(currow));
        }
         return maxArea;
    }
     public int largestRectangleArea(int[] heights) {
        
        int n = heights.length;
        int[] pS = prevSmaller(heights);
        int[] nS = nextSmaller(heights);
               
        int maxArea = 0;
        for(int i=0; i<heights.length; i++) {
            int curArea = (nS[i] - pS[i] - 1) * heights[i];  // area = height x width
            maxArea = Math.max(curArea, maxArea);
        }
        
        return maxArea;
    }
    
    private int[] prevSmaller(int[] arr) {
        
        int[] pS = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<arr.length; i++) {
            if(stack.isEmpty()){
                stack.push(i);
                pS[i]=-1;
            }else{
                while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    pS[i] = -1;
                }
                else{
                    pS[i] = stack.peek();
                }
                stack.push(i);
            }
        }
        
        return pS;
    }
    
    private int[] nextSmaller(int[] arr) {
        
        int[] nS = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        
        for(int i=arr.length-1; i>=0; i--) {
            if(stack.isEmpty()){
                stack.push(i);
                nS[i]=arr.length;
            }else{
                while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    nS[i] = arr.length;
                }else{
                    nS[i] = stack.peek();
                }
                stack.push(i);
            }
        }
        
        return nS;
    }
}