class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> mp1=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            mp1.put(arr[i],mp1.getOrDefault(arr[i],0)+1);
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(mp1.get(arr[i])==1){
                count++;
            }
            if(mp1.get(arr[i])==1 && count==k){
                return arr[i];
            }
        }
        return "";
        
    } 
}