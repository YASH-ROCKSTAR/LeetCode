class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int[] merge=new int[n1+n2];
        int i=0;
        int j=0;
        int k=0;
        while(i<n1 && j<n2){
            if(nums1[i]<nums2[j]){
                merge[k]=nums1[i];
                i++;
                k++;
            }else{
                merge[k]=nums2[j];
                j++;
                k++;
            }
        }
        while(i<n1){
            merge[k]=nums1[i];
            i++;
            k++;
            
        }
        while(j<n2){
            merge[k]=nums2[j];
                j++;
                k++;
        }
        double median=0.0;
        int mid=merge.length/2;
        if(merge.length%2==1){
            median=merge[mid];
        }else{
            median=(merge[mid]+merge[mid-1])/2.0;
        }
        return median;
    }
}