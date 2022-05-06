class Solution {
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
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i])
                stack.pop();
            
            if(stack.isEmpty())
                pS[i] = -1;
            else
                pS[i] = stack.peek();
            
            stack.push(i);
        }
        
        return pS;
    }
    
    private int[] nextSmaller(int[] arr) {
        
        int[] nS = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        
        for(int i=arr.length-1; i>=0; i--) {
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i])
                    stack.pop();
            
            if(stack.isEmpty())
                nS[i] = arr.length;
            else
                nS[i] = stack.peek();
            
            stack.push(i);
        }
        
        return nS;
    }
}