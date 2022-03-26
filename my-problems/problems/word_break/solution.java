class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
       return canConstruct(s, wordDict, new HashMap<>());
    }
  
  private boolean canConstruct(String s, List<String> wordDict,Map<String,Boolean> map){
    
    if(map.containsKey(s)) return map.get(s);
    
    if(s.isEmpty()) return true;
    
    for(String word : wordDict){
      if(s.startsWith(word)){
        if(canConstruct(s.substring(word.length()), wordDict,map)){
          map.put(s,true);
          return true;
        }
      }
    }
    
    map.put(s,false);
    return false;
  }
}