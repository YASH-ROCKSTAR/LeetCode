class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hh=new HashMap<Integer,Integer>();
        for(int i:nums1){
            hh.put(i,hh.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:nums2){
            if(hh.containsKey(i)){
                list.add(i);
                hh.remove(i);
            }
        }
        int[] arr=new int[list.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}