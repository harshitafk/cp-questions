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
    
    Map<Integer,Integer> map = new HashMap<>();int prePrefix = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
       // map = new HashMap<>()
        for(int i = 0; i < inorder.length; i++){
            map.put(inorder[i],i);
        }
        
        return build(preorder,0,preorder.length-1);
    }
    
    public TreeNode build(int[] preorder,int left, int right){
        if(left > right) return null;
        
        int rootValue = preorder[prePrefix++];
        TreeNode node = new TreeNode(rootValue);
        
        node.left = build(preorder,left,map.get(rootValue)-1);
        node.right =  build(preorder,map.get(rootValue)+1,right);
        
        return node;
    }
}