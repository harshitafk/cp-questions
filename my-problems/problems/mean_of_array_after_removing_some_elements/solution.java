class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
      
      int length = arr.length;
      int remLen = length *  5 / 100;
      
      int sum = 0;
      
      for(int i : arr){
        sum += i;
      }
      
      for(int i = 0; i < remLen; i++){
        sum -= arr[i];
      }
      
      for(int i = length-1; i >= length - remLen; i--){
        sum -= arr[i];
      }
      
      length -= (2 * remLen);
      
      return (double)((double) sum / (double) length);
    }
}