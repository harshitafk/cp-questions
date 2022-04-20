/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class BSTIterator {

    private Deque<Integer> val;
    public BSTIterator(TreeNode root) {
        this.val = new ArrayDeque<>();
      getValues(root);
    }
  
  private void getValues(TreeNode root){
    if(root == null) return;
    
    getValues(root.left);
    val.push(root.val);
    getValues(root.right);
  }
    
    public int next() {
        return val.pollLast();
    }
    
    public boolean hasNext() {
       if(val.peek() == null){
         return false;
       }
      
      return true;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */