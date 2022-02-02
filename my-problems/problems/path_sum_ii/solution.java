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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list = new ArrayList<>();
      
      pathSumCalculate(list,new ArrayList<>(),targetSum,root);
      
      return list;
    }
  
  public void pathSumCalculate(List<List<Integer>> list,List<Integer> addNode,int targetSum,TreeNode root){
    
    if(root == null) return;
    
    addNode.add(root.val);
    
    if(root.left == null && root.right == null && (targetSum == root.val)){
      list.add(new ArrayList<>(addNode));
    }else{
      pathSumCalculate(list,addNode,targetSum-root.val,root.left);
      pathSumCalculate(list,addNode,targetSum-root.val,root.right);
    }
      addNode.remove(addNode.size()-1); 
       
  }
} 