class Solution {
    public int minDeletions(String s) {
        int[] freq = new int[26];
        
        for(int i = 0; i < s.length(); i++) freq[s.charAt(i)-'a']++;
        
        Arrays.sort(freq);
        
        int dCount = 0;
        int maxFreq = s.length();
        
        for(int i = 25; i >= 0 && freq[i] > 0; i--){
            if(freq[i] > maxFreq){
                dCount += freq[i] - maxFreq;
                freq[i] = maxFreq;
            }
            maxFreq = Math.max(0,freq[i]-1);
        }
        
        return dCount;
    }
}