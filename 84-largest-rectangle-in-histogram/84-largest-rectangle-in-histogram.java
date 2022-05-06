class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxarea=0;
        int ps[]=prevsmaller(heights);
        int ns[]=nextsmaller(heights);
        
        for(int i=0;i<heights.length;i++){
            int curr=(ns[i]-ps[i]-1)*heights[i];
            maxarea=Math.max(maxarea,curr);
        }
        return maxarea;
    }
    public int[] prevsmaller(int[] arr){
        int[] ps=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i])
                st.pop();

            ps[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        return ps;
    }
    public int[] nextsmaller(int[] arr){
        int[] ns=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i])
                st.pop();
                ns[i]=st.isEmpty()?arr.length:st.peek();
            st.push(i);
        }
        return ns;
    }
}