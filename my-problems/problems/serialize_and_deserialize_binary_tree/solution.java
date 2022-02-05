/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
       StringBuilder builder = new StringBuilder();
       serializeNode(root,builder);
      return builder.toString();
    }
  
  private void serializeNode(TreeNode root,StringBuilder builder){
    if(root == null){
      builder.append("X,");
      return;
    }
    builder.append(root.val).append(",");
    serializeNode(root.left,builder); 
    serializeNode(root.right,builder);    
  }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
      Deque<String> queue = new LinkedList<>();
      queue.addAll(Arrays.asList(data.split(",")));
      return deserializeString(queue);
    }
  
  private TreeNode deserializeString(Deque<String> queue){
    String val = queue.remove();
    if(val.equals("X")){
      return null;
    }else{
      TreeNode node = new TreeNode(Integer.valueOf(val));
      node.left = deserializeString(queue);
      node.right =deserializeString(queue);
      return node;
    }
  }
  
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));