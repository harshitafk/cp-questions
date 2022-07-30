class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
       int[] bMax = count("");
      
      for(String word : words2){
        int[] wordCount = count(word);
        
        for(int i = 0; i < 26; i++){
          bMax[i] = Math.max(bMax[i],wordCount[i]);
        }
      }
      
      List<String> list = new ArrayList<>();
      
      search: for(String word : words1){
        int[] wordCount = count(word);
        
        for(int i = 0; i < 26; i++){
          if(wordCount[i] < bMax[i]) continue search;
        }
        
        list.add(word);
      }
      
      return list;
    }
  
  private int[] count(String s){
    int[] cr = new int[26];
    
    for(char c : s.toCharArray()){
      cr[c - 'a']++;
    }
    
    return cr;
  }
}