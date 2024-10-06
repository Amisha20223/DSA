import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        
        
        int[] merged = new int[len1 + len2];
       
        for (int i = 0; i < len1; i++) {
            merged[i] = nums1[i];
        }
        
    
        for (int i = 0; i < len2; i++) {
            merged[len1 + i] = nums2[i];
        }
        
        
        Arrays.sort(merged);
        
       
        int totalLength = merged.length;
        if (totalLength % 2 == 1) {
           
            return merged[totalLength / 2];
        } else {
            
            int mid1 = merged[totalLength / 2 - 1];
            int mid2 = merged[totalLength / 2];
            return (mid1 + mid2) / 2.0;
        }
    }
}
