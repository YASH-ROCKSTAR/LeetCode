class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hh=new HashSet<Integer>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    hh.add(nums1[i]);
                }
            }
        }
        int j=0;
        int[] arr=new int[hh.size()];
        for(Integer i:hh){
            arr[j++]=i;
        }
        return arr;
    }
}