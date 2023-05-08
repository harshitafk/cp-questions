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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
       
       Map<Integer,Integer> map = new HashMap<Integer,Integer>();

       for(int i = 0; i < inorder.length; i++){
           map.put(inorder[i],i);
       }

       return construct(map, inorder, postorder, 0,inorder.length-1, 0, postorder.length-1);

    }

    private TreeNode construct(Map<Integer,Integer> map, int[] inorder, int[] postorder, int is, int ie, int ps, int pe){

        if(is>ie || ps> pe) return null;

        TreeNode node = new TreeNode(postorder[pe]);

        int idx = map.get(postorder[pe]);

        TreeNode left = construct(map, inorder, postorder, is, idx-1, ps, ps+idx-is-1);
        TreeNode right = construct(map, inorder, postorder, idx+1, ie, ps+idx-is,pe-1);

        node.left = left;
        node.right = right;

        return node;
    }
}