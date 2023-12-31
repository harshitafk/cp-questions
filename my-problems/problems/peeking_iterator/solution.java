// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
  
  private Iterator<Integer> iterator;
  private Integer value = null;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    this.iterator = iterator;
    
      if(iterator.hasNext()) value = iterator.next();
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return value;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
        int val = peek();
        
         if(iterator.hasNext()){ 
           value = iterator.next();
         }else{
           value = null;
         }
        
        return val;
	}
	
	@Override
	public boolean hasNext() {
	    return (iterator.hasNext() || value != null);
	}
}