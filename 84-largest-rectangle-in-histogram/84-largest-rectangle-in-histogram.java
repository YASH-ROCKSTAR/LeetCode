import java.util.*;
class Solution {
    public int largestRectangleArea(int[] height) {
        int n=height.length;
        Stack<Integer> st=new Stack<>();
        int[] leftsmall=new int[n];
        int[] rightsmall=new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && height[st.peek()]>=height[i]){
                st.pop();
            }
            if(st.isEmpty())
              leftsmall[i]=0;  
             else
                leftsmall[i]=st.peek()+1;
            st.push(i);
        }
        while(!st.isEmpty()) st.pop();
        for(int i=n-1;i>=0;i--){
                while(!st.isEmpty() && height[st.peek()]>=height[i]){
                    st.pop();
                }
                if(st.isEmpty())
                    rightsmall[i]=n-1;
                else
                    rightsmall[i]=st.peek()-1;
                st.push(i);
        }    
        int maX=0;
        for(int i=0;i<n;i++){
            maX=Math.max(maX,height[i]*(rightsmall[i]-leftsmall[i]+1));
        }
        return maX;
    }
}