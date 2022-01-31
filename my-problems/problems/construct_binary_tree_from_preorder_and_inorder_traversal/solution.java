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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < inorder.length; i++){
          map.put(inorder[i],i);
        }
      
      return splitTree(preorder,map,0,0,inorder.length-1);
    }
  
  public TreeNode splitTree(int[] preorder, Map<Integer,Integer> inOrderMap, int prePointer, int inOrderLeft, int inOrderRight){
    int preOrderVal = preorder[prePointer], inOrderValuePointer = inOrderMap.get(preOrderVal);
    TreeNode node = new TreeNode(preOrderVal);
    if(inOrderValuePointer > inOrderLeft){
      node.left = splitTree(preorder,inOrderMap,prePointer+1,inOrderLeft,inOrderValuePointer-1);
    }
    
    if(inOrderValuePointer < inOrderRight){
      node.right = splitTree(preorder,inOrderMap,prePointer+inOrderValuePointer-inOrderLeft+1,inOrderValuePointer+1,inOrderRight);
    }
    
    return node;
  }
  
  
}