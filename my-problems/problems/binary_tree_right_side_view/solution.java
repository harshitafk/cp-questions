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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        
        sideView(root,list,0);
        
        return list;
    }
    
    public void sideView(TreeNode root,List<Integer> list,int level){
        if(root == null) return;
        
        if(list.size() == level) list.add(root.val);
        
        sideView(root.right,list,level+1);
        sideView(root.left,list,level+1);
    }
}