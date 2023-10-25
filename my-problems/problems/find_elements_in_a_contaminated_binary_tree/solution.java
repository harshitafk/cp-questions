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
class FindElements {

    private Set<Integer> set;
    public FindElements(TreeNode root) {
        set = new HashSet<>();
        nodeToSet(root, 0);
    }
    
    public boolean find(int target) {
        return set.contains(target);
    }

    public void nodeToSet(TreeNode root, int parent) {
        if(root == null) return;

        root.val = parent;
        set.add(root.val);
        nodeToSet(root.left, 2*parent + 1);
        nodeToSet(root.right, 2*parent + 2);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */