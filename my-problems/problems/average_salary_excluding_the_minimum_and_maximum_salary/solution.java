class Solution {
    public double average(int[] salary) {
        double max = Double.MAX_VALUE;
        double min = Double.MIN_VALUE;
        double sum = 0d;
      for(int s : salary){
         min = Math.max(min,s);
         max = Math.min(max,s);
         sum += s;
      }
      
      return (sum - min - max) / (salary.length - 2);
  
    }
}