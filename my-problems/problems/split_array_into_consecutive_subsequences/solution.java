class Solution {
    public boolean isPossible(int[] nums) {
        Map<Integer,Integer> freq = new HashMap<>();
        Map<Integer,Integer> hypoFreq = new HashMap<>();

        for(int num : nums) freq.put(num, freq.getOrDefault(num,0)+1);

        for(int num : nums) {
            if(freq.get(num) == 0) continue;
            else if(hypoFreq.getOrDefault(num,0) > 0){
                hypoFreq.put(num,hypoFreq.get(num)-1);
                hypoFreq.put(num+1,hypoFreq.getOrDefault(num+1,0)+1);
            }else if(freq.getOrDefault(num+1,0) > 0 &&
                    freq.getOrDefault(num+2,0) > 0){
                freq.put(num+1,freq.get(num+1)-1);
                freq.put(num+2,freq.get(num+2)-1);
                hypoFreq.put(num+3,hypoFreq.getOrDefault(num+3,0)+1);
            }else return false;

            freq.put(num, freq.get(num)-1);
        }
        return true;
    }
}