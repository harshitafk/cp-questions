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
        List<List<Integer>> ll = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        
        findsum(ll,list,root,targetSum);
     
        return ll;
    }
    
    private void findsum(List<List<Integer>> ll, List<Integer> list, TreeNode root, int targetSum){
        
        if(root == null) return;
        
        list.add(root.val);
        
        if(root.left == null && root.right == null && targetSum == root.val){
            ll.add(new ArrayList<>(list));
        }else{
            findsum(ll,list,root.left,targetSum - root.val);
            findsum(ll,list,root.right,targetSum - root.val);
        }
        
        list.remove(list.size()-1);
        
        
    }
}