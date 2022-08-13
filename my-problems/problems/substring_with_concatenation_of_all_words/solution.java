class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> list = new ArrayList<>();

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        int len = s.length(), wordsLen = words.length, wLen = words[0].length(),
                totalLen = wordsLen * wLen;

        for (int i = 0; i < len - totalLen + 1; i++) {
            Map<String, Integer> seen = new HashMap<>();

            int  j = 0;

            while(j < wordsLen){
                String word = s.substring(i + j*wLen, i + (j + 1)*wLen);
                
                if(map.containsKey(word)){
                    seen.put(word,seen.getOrDefault(word,0)+1);
                    if(seen.get(word) > map.getOrDefault(word,0)){
                        break;
                    }
                }else{
                    break;
                }
                j++;
            }
            if(j ==wordsLen){
                list.add(i);
            }
        }


        return list;
    }
}