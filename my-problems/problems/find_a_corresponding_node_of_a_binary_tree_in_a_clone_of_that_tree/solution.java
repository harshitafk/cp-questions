/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    
     TreeNode node;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        
        getCopy(original,cloned,target);
        
        return node;
    }
    
    private void getCopy(TreeNode original,TreeNode cloned,TreeNode target){
        
        if(original == null && cloned == null){
            return;
        }
        
        getCopy(original.left,cloned.left,target);
        
        if(target == original){
            node = cloned;
            
            return;
        }
        
        getCopy(original.right,cloned.right,target);
    }
}