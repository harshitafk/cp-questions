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
class Solution {
  
    private Map<Integer,DataNode> map = new HashMap<>();
    public boolean isCousins(TreeNode root, int x, int y) {
        findCousins(root,x,y,0,0);
      
      if(map.get(x).depth == map.get(y).depth && map.get(x).parent != map.get(y).parent) return true;
      return false;
    }
  
  public void findCousins(TreeNode root, int x, int y,int depth,int parent){
    
    if(root == null) return;
    
    if(root.val == x || root.val == y) map.put(root.val,new DataNode(depth,parent));
    
    findCousins(root.left, x, y, depth+1,root.val);
    findCousins(root.right, x, y, depth+1,root.val);
    
  }
  
  
  public class DataNode{
    public int depth;
    public int parent;
    
    public DataNode(int depth,int parent){
      this.depth = depth;
      this.parent = parent;
    }
  
  }
}