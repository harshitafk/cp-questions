class Solution {
  
    private Map<String,Integer> map = new HashMap<>();
    private int sLen;
    private int arrSize;
    private int wordLen;
    private int subStringLength;
    public List<Integer> findSubstring(String s, String[] words) {
      sLen = s.length();
      arrSize = words.length;
      wordLen = words[0].length();
      subStringLength = wordLen * arrSize;
      
      for(String word : words) map.put(word,  map.getOrDefault(word, 0) + 1);
      
      List<Integer> list = new ArrayList<>();
      for(int i = 0; i < sLen - subStringLength + 1; i++){
        if(helper(s,i)){
          list.add(i);
        }
      }
      
      return list;
    }
  
  private boolean helper(String s, int i){
    Map<String,Integer> rmap = new HashMap<>(map);
    int count = 0;
    for(int j = i; j < i + subStringLength; j+=wordLen){
      String sub = s.substring(j,j + wordLen);
      
      if(rmap.getOrDefault(sub, 0) != 0){
        rmap.put(sub, rmap.get(sub) - 1);
        count++;
      }else{
        break;
      }
    }
    
    return count == arrSize;
  }
}