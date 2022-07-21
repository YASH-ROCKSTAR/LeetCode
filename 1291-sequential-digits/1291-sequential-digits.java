class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String digit="123456789";
        List<Integer> li=new ArrayList<>();
        for(int i=1;i<=9;i++){
            for(int j=0;j+i<=digit.length();j++){
                String subStr=digit.substring(j,i+j);
                int value=Integer.parseInt(subStr);
                if(value>=low && value<=high){
                    li.add(value);
                }
            }
        }
        return li;
    }
}