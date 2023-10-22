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
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        return constBST(list,0, list.size()-1);
    }

    private void inorder(TreeNode root,List<Integer> list){
        if(root == null) return;
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right, list);
        return;
    }

    private TreeNode constBST(List<Integer> list, int low, int high){
        if(low > high) return null;

        int mid = low + ((high - low)/2);
        int val = list.get(mid);

        TreeNode node = new TreeNode(val);
        node.left = constBST(list, low, mid-1);
        node.right = constBST(list, mid+1, high);
        return node;
    }

}