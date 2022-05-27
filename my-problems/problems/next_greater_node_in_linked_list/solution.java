/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> list = new ArrayList<>();
        
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        
        Stack<Element> stack = new Stack<>();
        int[] ans = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++){
            
            if(i == 0){
                stack.push(new Element(list.get(i),i));
            }else{
                if(!stack.isEmpty()){
                    int n = stack.peek().val;
                      while(list.get(i) > n){
                    
                    Element e = stack.pop();
                    ans[e.pos] = list.get(i);
                    
                          if(stack.isEmpty()){
                              break;
                          }else{
                              n = stack.peek().val;
                          }
                }
                }
              
                
                stack.push(new Element(list.get(i),i));
            }
        }
        
        return ans;
    }
}

class Element{
    int val;
    int pos;
    
    public Element(int val, int pos){
        this.val = val;
        this.pos = pos;
    }
}