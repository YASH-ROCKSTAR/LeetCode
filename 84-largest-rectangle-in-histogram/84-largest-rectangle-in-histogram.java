class Solution {
    public int largestRectangleArea(int[] heights) {
        int[] nexsmaller=nextsmaller(heights);
        int[] prev=prevsmaller(heights);
        
        int maxarea=0;
        
        for(int i=0;i<heights.length;i++){
            int newarea=(nexsmaller[i]-prev[i]-1)*heights[i];
            maxarea=Math.max(newarea,maxarea);
        }
        return maxarea;
    }
    public int[] prevsmaller(int[] arr){
        Stack<Integer> st=new Stack<>();
        
        int[] arr1=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                arr1[i]=-1;
            }else{
                arr1[i]=st.peek();
            }
            st.push(i);
        }
        return arr1;
    }
    public int[] nextsmaller(int[] arr){
        Stack<Integer> st=new Stack<>();
        
        int[] arr1=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                arr1[i]=arr.length;
            }else{
                arr1[i]=st.peek();
            }
            st.push(i);
        }
        return arr1;
    }
}