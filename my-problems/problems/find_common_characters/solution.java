class Solution {
    public List<String> commonChars(String[] words) {
        int[] freq1 = new int[26];
       
      
      List<String> list = new ArrayList<>();
      
      for(int i = 0; i < words[0].length(); i++){
        freq1[words[0].charAt(i) - 'a']++;
      }
      
      for(int i = 1; i < words.length; i++){
         int[] freq2 = new int[26];
         for(int j = 0; j < words[i].length(); j++){
           freq2[words[i].charAt(j) - 'a']++;
         }
        
        for(int j = 0; j < freq1.length; j++){
          freq1[j] = Math.min(freq1[j],freq2[j]);
        }
      }
      
      for(int i = 0; i < freq1.length; i++){
        while(freq1[i] >= 1){
          char c = (char) (i + 97);
          list.add(String.valueOf(c));
          freq1[i]--;
        }
      }
      
      return list;
         
    }
}