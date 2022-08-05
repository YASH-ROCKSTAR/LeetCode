class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hh=new HashMap<>();
        for(int i:nums1){
            hh.put(i,hh.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> li=new ArrayList<>();
        for(int i:nums2){
            if(hh.containsKey(i)){
                li.add(i);
                hh.remove(i);
            }
        }
        int[] arr=new int[li.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=li.get(i);
        }
        return arr;
    }
}