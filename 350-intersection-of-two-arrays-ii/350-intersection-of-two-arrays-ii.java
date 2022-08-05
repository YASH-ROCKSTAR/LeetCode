class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> li=new ArrayList<>();
        HashMap<Integer,Integer> mp1=new HashMap<>();
        HashMap<Integer,Integer> mp2=new HashMap<>();
        for(int i:nums1){
            if(mp1.containsKey(i)){
                mp1.put(i,mp1.get(i)+1);
            }else{
                mp1.put(i,1);
            }
        }
        for(int i:nums2){
            if(mp2.containsKey(i)){
                mp2.put( i,mp2.get(i)+1);
            }
            else{
                mp2.put(i,1);
            }
        }
        for(Integer kk:mp1.keySet()){
            if(mp2.containsKey(kk)){
                int x=Math.min(mp2.get(kk),mp1.get(kk));
                
                while(x-->0){
                    li.add(kk);
                }
            }
        }
        int[] arr=new int[li.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=li.get(i);
        }
        
        return arr;
    }
}