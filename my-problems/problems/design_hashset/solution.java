class MyHashSet {

    private long[] set;
    public MyHashSet() {
        this.set = new long[1000001];
    }
    
    public void add(int key) {
        set[key] = key+1;
    }
    
    public void remove(int key) {
        set[key] = 0;
    }
    
    public boolean contains(int key) {
        if(set[key] == 0){
          return false;
        }else{
          return true;
        }
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */