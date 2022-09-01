class Solution {
    public int maximalRectangle(char[][] matrix) {
        int n=matrix[0].length;
        int[] curr=new int[n];
        int maxarea=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]=='0'){
                    curr[j]=0;
                }else{
                    curr[j]+=1;
                }
            }
            maxarea=Math.max(maxarea,maxarearec(curr));
        }
        return maxarea;
    }
    public int maxarearec(int[] height){
        int[] sma=nexsmaller(height);
        int[] pre=prev(height);
        
        int maxarea=0;
        for(int i=0;i<height.length;i++){
            int newarea=(sma[i]-pre[i]-1)*height[i];
            maxarea=Math.max(maxarea,newarea);
        }
        return maxarea;
    }
    
    public int[] prev(int[] arr){
        int[] ar=new int[arr.length];
        Stack<Integer> st=new Stack<Integer>();
        
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ar[i]=-1;
            }
            else{
                ar[i]=st.peek();
            }
            st.push(i);
        }
        return ar;
    }
    public int[] nexsmaller(int[] arr){
        int[] ar=new int[arr.length];
        Stack<Integer> st=new Stack<Integer>();
        
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ar[i]=arr.length;
            }
            else{
                ar[i]=st.peek();
            }
            st.push(i);
        }
        return ar;
    }
}