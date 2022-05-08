/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {

    private Deque<NestedInteger> queue;
    public NestedIterator(List<NestedInteger> nestedList) {
        queue = new ArrayDeque<>();
      prepareList(nestedList);
    }

    @Override
    public Integer next() {
      if(!hasNext()){
        return null;
      }
      
      return queue.pop().getInteger();
    }

    @Override
    public boolean hasNext() {
        while(!queue.isEmpty() && !(queue.peek().isInteger())){
          prepareList(queue.pop().getList());
        }
      
      return !queue.isEmpty();
    }
  
  private void prepareList(List<NestedInteger> list){
    for(int i = list.size() - 1; i >= 0; i--){
        queue.push(list.get(i));
    }
  }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */