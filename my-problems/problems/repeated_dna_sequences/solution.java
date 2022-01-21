class Solution {
    
    public List<String> findRepeatedDnaSequences(String s) {
     Set<Integer> words = new HashSet<>();
        Set<String> doubleWords = new HashSet<>();
        char[] map = new char[26];
        map['C' - 'A'] = 1;
        map['G' - 'A'] = 2;
        map['T' - 'A'] = 3;

        for(int i = 0; i < s.length() - 9; i++) {
            int v = 0;
            for(int j = i; j < i + 10; j++) {
                v = v << 2;
                v = v | map[s.charAt(j) - 'A'];
            }
            if(!words.add(v)) {
            	doubleWords.add(s.substring(i, i + 10));
            }
        }
        return new ArrayList<>(doubleWords);
    }
}