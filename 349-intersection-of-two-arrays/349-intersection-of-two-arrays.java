class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i:nums1){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        List<Integer> li=new ArrayList<>();
        for(int i:nums2){
            if(mp.containsKey(i)){
                li.add(i);
                mp.remove(i);
            }
        }
        int[] arr=new int[li.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=li.get(i);
        }
        return arr;
    }
}