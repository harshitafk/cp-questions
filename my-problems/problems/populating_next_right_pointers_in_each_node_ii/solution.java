/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
      
      if(root == null) return null;
      
        if(root.left != null){
          if(root.right != null){
            root.left.next = root.right;
          }else{
            Node node = findNext(root.next);
            root.left.next = node;
          }
        }
          
          if(root.right != null){
            Node node = findNext(root.next);
            root.right.next = node;
          }
      
      connect(root.right);
      connect(root.left);
      
      return root;
    }
  
  private Node findNext(Node root){
    while(root != null){
      if(root.left != null){
        return root.left;
      }else if(root.right != null){
        return root.right;
      }
      
      root = root.next;
    }
    return root;
  }
}