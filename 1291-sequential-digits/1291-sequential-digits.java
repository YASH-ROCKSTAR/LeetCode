class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String str="123456789";
        List<Integer> li=new ArrayList<>();
        for(int i=1;i<=9;i++){
            for(int j=0;j+i<=str.length();j++){
                String sub=str.substring(j,j+i);
                int value=Integer.parseInt(sub);
                if(value>=low && value<=high){
                    li.add(value);
                }
            }
        }
        return li;
    }
}