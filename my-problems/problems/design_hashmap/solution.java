class MyHashMap {

   private LinkedList<Entry>[] map;
    private static int SIZE = 769;
    public MyHashMap() {
        this.map = new LinkedList[SIZE];
    }
    
    public void put(int key, int value) {
        int bucket = key % SIZE;
      
      if(map[bucket] == null){
        map[bucket] = new LinkedList<Entry>();
        map[bucket].add(new Entry(key,value));
        return;
      }
      
      for(Entry entry : map[bucket]){
        if(entry.getKey() == key){
          entry.setValue(value); 
          return;
        }
      }
      
       map[bucket].add(new Entry(key,value));
    }
    
    public int get(int key) {
        int bucket = key % SIZE;
      
      if(map[bucket] == null) return -1;
      
      for(Entry entry : map[bucket]){
        if(entry.getKey() == key){
          return entry.getValue();
        }
      }
      
      return -1;
    }
    
    public void remove(int key) {
      
      int bucket = key % SIZE;
      
       if(map[bucket] == null) return;
      
      Entry toRem = null;
      
      for(Entry entry : map[bucket]){
        if(entry.getKey() == key){
         toRem = entry;
          break;
        }
      }
      
      if(toRem != null){
          map[bucket].remove(toRem);
      }     
    }
  
  class Entry{
    private int key;
    private int value;
    
   public Entry(int key, int value){
      this.key = key;
      this.value = value;
    }
    
    public int getKey(){
      return this.key;
    }
    
    public int getValue(){
      return this.value;
    }
    
    public void setValue(int value){
       this.value = value;
    }
  }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */