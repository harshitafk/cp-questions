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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        
        int i = 0;
        
        ListNode list3 = list1;
        ListNode temp = list1;
        
        while(i <= b){
            if(i < a-1){
                list3 = list3.next;
            }
            
            
            if(i <= b){
                temp = temp.next;
            }
            
            i++;
        }
        
        list3.next = list2;
        
        // while(i < b){
        //     temp = temp.next;
        //     i++;
        // }
        
        while(list3.next != null){
            list3 = list3.next;
        }
        
        list3.next = temp;
        //list3.next = temp;
        

        return list1;
    }
}