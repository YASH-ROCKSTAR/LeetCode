class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int[] r=new int[n-k+1];
        int ri=0;
        Deque<Integer> q=new ArrayDeque<>();
        for(int i=0;i<nums.length;i++){
            //removing element out of bound
            //mean if we are in second k size window and some element in deque 
            //are present that doesnt belong to that window then we remove them
            if(!q.isEmpty() && q.peek()==i-k){
                q.poll();
            }
            while(!q.isEmpty() && nums[q.peekLast()]<=nums[i]){
                q.pollLast();
            }
            q.offer(i);
            //putting greatest element of each k size window
            if(i>=k-1){
                r[ri++]=nums[q.peek()];
            }
        }
        return r;
    }
}