class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
       Set<String> set = new HashSet<>(wordList);
        if(!set.contains(endWord)) return 0;

        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);

        Set<String> visited = new HashSet<>();
        int changes = 1;
        while(!queue.isEmpty()){
            int size = queue.size();

            for(int i = 0; i < size; i++){
                String word = queue.poll();
                if(word.equals(endWord)) return changes;

                for(int j = 0; j < word.length(); j++){
                    for(int k = 'a'; k <= 'z'; k++){
                        char[] c = word.toCharArray();
                        c[j] = (char)k;
                        
                        String str = new String(c);
                        if(set.contains(str) && !visited.contains(str)){
                            queue.add(str);
                            visited.add(str);
                        }
                    }
                }
            }

            ++changes;
        }

        return 0;   
    }
}