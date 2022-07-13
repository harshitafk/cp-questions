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
        
        List<List<Integer>> list = new ArrayList<>();
        level(root,0,list);
        
        return list;
    }
    
    public void level(TreeNode root,int level, List<List<Integer>> listOfList){
        
        if(root == null) return;
        
        if(listOfList.size() <= level)  listOfList.add(new LinkedList<>());
        
        listOfList.get(level).add(root.val);
        level(root.left,level+1,listOfList);
        level(root.right,level+1,listOfList);
        
    }
}