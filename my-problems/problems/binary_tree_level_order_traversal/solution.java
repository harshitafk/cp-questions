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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> listOfList = new ArrayList<>();
      
      order(listOfList,0,root);
      
      return listOfList;
    }
  
  private void order(List<List<Integer>> listOfList,int depth,TreeNode root){
    if(root == null) return;
    
    if(listOfList.size() == depth) listOfList.add(new LinkedList<>());
    
    listOfList.get(depth).add(root.val);
    
    order(listOfList,depth + 1,root.left);
    order(listOfList,depth + 1,root.right);
  }
}