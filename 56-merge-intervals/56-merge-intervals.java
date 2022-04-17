class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> li=new ArrayList<>();
        //boundary cndition
        if(intervals.length==0 || intervals==null){
            return li.toArray(new int[0][]);
        }
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int start=intervals[0][0];
        int end=intervals[0][1];
        for(int[] i:intervals){
            if(i[0]<=end){
                end=Math.max(end,i[1]);
            }else{
                li.add(new int[]{start,end});
                start=i[0];
                end=i[1];
            }
        }
        li.add(new int[]{start,end});
        return li.toArray(new int[0][]);
    }
}