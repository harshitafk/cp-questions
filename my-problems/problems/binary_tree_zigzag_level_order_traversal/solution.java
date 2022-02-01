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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> solution = new LinkedList<>();
        
        zigZag(solution,root,0);
      
      return solution;
    }
  
  private void zigZag(List<List<Integer>> solution,TreeNode root,int level){
    
    if(root == null) return;
    
    if(solution.size() <= level){
      List<Integer> addList = new LinkedList<>();
      solution.add(addList);
    }
    
    List<Integer> collection = solution.get(level);
    if(level % 2 == 0) collection.add(root.val);
    else collection.add(0,root.val);
    
    zigZag(solution,root.left,level+1);
    zigZag(solution,root.right,level+1);
      
  }
}