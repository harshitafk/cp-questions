class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        
        int[] p = find(pattern);
        List<String> list = new ArrayList<>();
        for(String word : words){
            if(Arrays.equals(p,find(word))){
                list.add(word);
            }
        }
        
        return list;
    }
    
    private int[] find(String w){
        Map<Character,Integer> map = new HashMap<>();
        
        int n = w.length();
        
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            map.putIfAbsent(w.charAt(i),map.size());
            arr[i] = map.get(w.charAt(i));
        }
        
        return arr;
    }
}