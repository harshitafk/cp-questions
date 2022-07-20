class Solution {
    public int numMatchingSubseq(String s, String[] words) {
             int result = 0;
	      
	      Map<String,Integer> map = new HashMap<>();
	      
	      for(String word : words){
	        map.put(word,map.getOrDefault(word,0)+1);
	      }
	      
	      char[] schar = s.toCharArray();
	      
	      for(String word : map.keySet()){
	        char[] wordchar = word.toCharArray();
	        int m = word.length();
	        
	        int j = 0;
	        
	        for(int i = 0; i < s.length() && j < m; i++) {
	        	if(schar[i] == wordchar[j]) {
	        		j++;
	        	}
	        }
	        
	        if(j == m) {
	        	result += map.get(word);
	        }
	        
	        
	      }
	      
	      return result;
    }
}