class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>> map = new HashMap();
        for(String str : strs){
            char[] freq = new char[26];
            
            for(int i = 0; i < str.length(); i++){
                freq[str.charAt(i) - 'a']++;
            }
            
            String key = new String(freq);
            
            List<String> list = map.getOrDefault(key,new LinkedList<>());
            list.add(str);
            map.put(key,list);
            
        }
        
        return new LinkedList<>(map.values());
    }
}