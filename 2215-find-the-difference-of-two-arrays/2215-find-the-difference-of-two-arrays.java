class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> mp1=new HashMap<>();
        HashMap<Integer,Integer> mp2=new HashMap<>();
        
        for(int i:nums1){
            mp1.put(i,1);
        }
        for(int i:nums2){
            mp2.put(i,1);
        }

        ArrayList<Integer> li1=new ArrayList<>();
        for(Integer kk:mp1.keySet()){
            if(mp1.containsKey(kk)!=mp2.containsKey(kk)){
                li1.add(kk);
            }
        }
        
        ArrayList<Integer> li2=new ArrayList<>();
        for(Integer kk:mp2.keySet()){
            if(mp2.containsKey(kk)!=mp1.containsKey(kk)){
                li2.add(kk);
            }
        }
    
        List<List<Integer>> l=new ArrayList<>();
        l.add(li1);
        l.add(li2);
        
        return l;
    
    }
}