class Trie {

    private Node root;
    public Trie() {
        root = new Node();
    }
    
    public void insert(String word) {
        Node node = root;
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if(!node.containsKey(c)){
                node.put(word.charAt(i),new Node());
            }
            
            node = node.get(c);
        }
        
        node.setEnd();
    }
    
    public boolean search(String word) {
        Node node = root;
        
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if(!node.containsKey(c)){
               return false;
            }
            node = node.get(c);
        }
            
            if(node.isEnd()){
                return true;
            }
            
            return false;
    }
    
    public boolean startsWith(String prefix) {
        Node node = root;
        
         for(int i = 0; i < prefix.length(); i++){
            char c = prefix.charAt(i);
            if(!node.containsKey(c)){
               return false;
            }
            node = node.get(c);
        }
        
        return true;
    }
    
    
}


     class Node{
        Node[] node = new Node[26];
        boolean flag = false;
        
        public boolean containsKey(char ch) {
            return (node[ch - 'a'] != null);
        }
        
        Node get(char ch){
            return node[ch - 'a'];
        }
        
        public void put(char ch,Node n){
            node[ch - 'a'] = n;
        }
        
        public void setEnd(){
            flag = true;
        }
        
        public boolean isEnd(){
            return flag;
        }
        
    }

   

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */