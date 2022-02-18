class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        //r is for storing result;
        int[] r=new int[n-k+1];
        int ri=0; //for index at r
        
        //store index;
        Deque<Integer> q=new ArrayDeque<>();
        for(int i=0;i<nums.length;i++){
            // remove no out of range
            if(!q.isEmpty() && q.peek()==i-k){
                q.poll();
            }
            //remve smaller number in k range as they are useless
            //check from back
            while(!q.isEmpty() && nums[q.peekLast()]<=nums[i]){
                q.pollLast();
            }
            //put largest number
            q.offer(i);
            //we take front which is max element from nums[q.peek()]
            if(i>=k-1){
                r[ri++]=nums[q.peek()];
            }
        }
        return r;
    }
}