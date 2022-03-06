class Solution {
    public int numMatchingSubseq(String s, String[] words) {
       
        int result = 0;
         int n = s.length();
         HashMap<String,Boolean> map = new HashMap<>();
        for(String word : words){
            
            if(!map.containsKey(word)){
              int m = word.length();
              if(longestCommonSubsequence(s, word,n,m) == m) {
                  map.put(word,true);
                  result++;
              }else{
                  map.put(word,false); 
              }
            }else{
                if(map.get(word)){
                 result++;
                }
            }
           
        }
      
      return result;
    }
  
     public int longestCommonSubsequence(String text1, String text2,int n, int m) {
       int j = 0;
        for (int i = 0; i < n && j < m; i++){
            if (text2.charAt(j) == text1.charAt(i))
                j++;
        }
         
       return j;
        
  }
}