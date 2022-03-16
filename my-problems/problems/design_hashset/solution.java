class MyHashSet {

    long[] db = null;
    public MyHashSet() {
        this.db = new long[1000001];
        this.db[0] = -1;
    }
    
    public void add(int key) {
       db[key] = key;
    }
    
    public void remove(int key) {
        if(key == 0){
            db[0] = -1;
        }
        db[key] = -1;
    }
    
    public boolean contains(int key) {
        
        if(key == 0 && db[key] != -1){
            return true;
        }else if(db[key] == key){
            return true;
        }
        
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */