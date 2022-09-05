/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
       List<List<Integer>> ret = new LinkedList<>();

        if(root == null) return ret;

        Queue<Node> queue = new LinkedList<>();

        queue.offer(root);
        
        while(!queue.isEmpty()){
            List<Integer> currLevel = new LinkedList<>();
            int len = queue.size();
            for(int i = 0; i < len; i++){
                Node curr = queue.poll();
                currLevel.add(curr.val);
                for(Node n : curr.children) queue.offer(n);
            }
            ret.add(currLevel);
        }

        return ret;
    }
}