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
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> arrayList = new ArrayList<>();
        inorder(root,arrayList);
      
      for(int i = 0 , j = arrayList.size()-1; i < j;){
        if(arrayList.get(i) + arrayList.get(j) == k) return true;
        
        if(arrayList.get(i) + arrayList.get(j) < k) i++;
        else
          j--;
      }
      
      return false;
          
    }
  
    public void inorder(TreeNode root,List<Integer> arrayList){
      if(root == null) return;
      
      inorder(root.left,arrayList);
      arrayList.add(root.val);
      inorder(root.right,arrayList);
    }
}