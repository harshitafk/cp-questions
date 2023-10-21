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
    int count = 0;
    public int averageOfSubtree(TreeNode root) {
         postOrder(root);
        return count;
    }

    Pair postOrder(TreeNode root) {
        if(root == null) {
            Pair p = new Pair(0,0);
            return p;
        }

        Pair left = postOrder(root.left);
        Pair right = postOrder(root.right);

        int nodeCount = left.getKey + right.getKey + root.val;
        int numOfNodes = left.getValue + right.getValue + 1;

        if(root.val == (nodeCount/numOfNodes)){
            count++;
        }

        return new Pair(nodeCount,numOfNodes);
    }
}

class Pair{
    int getKey;
    int getValue;
    
    public Pair(int a, int b){
        this.getKey = a;
        this.getValue = b;
    }
}