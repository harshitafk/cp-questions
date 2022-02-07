class Solution {
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] array = mergeArray(nums1,nums2);
      if(array.length % 2 != 0){
        int mid = array.length / 2;
        
        return (double) array[mid];
      }else{
        int mid = array.length / 2;
        return (((double) array[mid]) + ((double) array[mid-1])) / 2;
      }
    }
  
  private int[] mergeArray(int[] nums1, int[] nums2){
    int[] array = new int[nums1.length + nums2.length];
    
    int i = 0,j = 0,k = 0;
    
    while(i < nums1.length && j <  nums2.length){
      if(nums1[i] < nums2[j]){
        array[k] = nums1[i];
        ++i;
        ++k;
      }else{
        array[k] = nums2[j];
        ++j;
        ++k;
      }
    }
    
    if(i < nums1.length){
      for(int m = i; m < nums1.length; m++){
        array[k] = nums1[m];
        ++k;
      }
    }else if(j < nums2.length){
      for(int m = j; m < nums2.length; m++){
        array[k] = nums2[m];
        ++k;
      }
    }
    
    return array;
  }
}