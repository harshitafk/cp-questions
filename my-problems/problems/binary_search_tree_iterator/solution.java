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

    ArrayDeque<TreeNode> stack;
    public BSTIterator(TreeNode root) {
        stack= new ArrayDeque<>();
        pushAll(root);
    }
  
    public void pushAll(TreeNode node){
      while(node != null){
        stack.addLast(node);
        node = node.left;
      }
    }
    
    public int next() {
        TreeNode node = stack.removeLast();
        pushAll(node.right);
      
      return node.val;
    }
    
    public boolean hasNext() {
        if(stack.isEmpty()) return false;
      else return true;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */