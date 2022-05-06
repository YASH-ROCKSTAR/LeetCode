class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        Stack<Integer> st=new Stack<Integer>();
        
        int[] res=new int[nums1.length];
        for(int num:nums2){
            while(!st.isEmpty() && st.peek()<num){
                map.put(st.pop(),num);
            }st.push(num);
        }
        int i=0;
        for(int num:nums1){
            res[i++]=map.getOrDefault(num,-1);
        }
        return res;
    }
}