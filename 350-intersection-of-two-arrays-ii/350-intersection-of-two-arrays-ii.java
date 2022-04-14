class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> set=new HashMap<>();
        List<Integer> li=new ArrayList<>();
        HashMap<Integer,Integer> mp1=new HashMap<>();
        HashMap<Integer,Integer> mp2=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            if(mp1.containsKey(nums1[i])){
                mp1.put(nums1[i],mp1.get(nums1[i])+1);
            }else{
                mp1.put(nums1[i],1);
            }
        }
        for(int i=0;i<nums2.length;i++){
            if(mp2.containsKey(nums2[i])){
                mp2.put(nums2[i],mp2.get(nums2[i])+1);
            }else{
                mp2.put(nums2[i],1);
            }
        }  
        for(Integer kk:mp1.keySet()){
            if(mp2.containsKey(kk)){
                int x=Math.min(mp2.get(kk),mp1.get(kk));
                while(x--> 0){
                    li.add(kk);
                }
            }
        }
        int[] arr=new int[li.size()];
        for(int i=0;i<li.size();i++){
            arr[i]=li.get(i);
            
        }
        return arr;
    }
}