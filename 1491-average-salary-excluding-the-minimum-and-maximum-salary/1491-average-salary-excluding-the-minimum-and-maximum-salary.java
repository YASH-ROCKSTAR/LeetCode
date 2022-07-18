class Solution {
    public double average(int[] salary) {
        int maxim=Integer.MIN_VALUE;
        int minim=Integer.MAX_VALUE;
        
        for(int i=0;i<salary.length;i++){
            maxim=Math.max(maxim,salary[i]);
            minim=Math.min(minim,salary[i]);
        }
        double sum=0;
        for(int i=0;i<salary.length;i++){
            if(salary[i]!=maxim && salary[i]!=minim){
                sum+=salary[i];
            }
        }
        return sum/(salary.length-2);
    }
}