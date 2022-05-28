class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
      Set<Integer> list = new HashSet<>();  
      Arrays.sort(nums1);
      for(int i : nums2){
        if(binarySearch(nums1,i)){
          list.add(i);
        }
      }
      
      int[] arr = new int[list.size()];
      int i = 0;
      for(int j : list){
        arr[i] = j;
        i++;
      }
      
      return arr;
    }
  
  
  private boolean binarySearch(int[] nums, int n){
    int start = 0;
    int end = nums.length-1;
    
    while(start <= end){
      int mid = start + (end - start)/2;
      
      if(nums[mid] == n){
        return true;
      }else if(nums[mid] > n){
        end = mid-1;
      }else{
         start = mid + 1;
      }
    }
    
    return false;
  }
}