class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();

        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            while(!stack.isEmpty() && stack.peek() < nums2[i]){
                map.put(stack.pop(),nums2[i]);
            }
            
            stack.push(nums2[i]);
        }
        
        for(int j = 0; j < nums1.length; j++){
            nums1[j] = map.containsKey(nums1[j]) ? map.get(nums1[j]) : -1; 
        }
        return nums1;
    }
}