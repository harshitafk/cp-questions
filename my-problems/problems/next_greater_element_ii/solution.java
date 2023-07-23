class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<Integer>();
        int[] result = new int[nums.length];
        Arrays.fill(result, -1);
        int n = nums.length;
        for(int i = 0; i < nums.length * 2; i++){
            int idx = i % n;
            while(!stack.isEmpty() && nums[stack.peek()] < nums[idx]){
                result[stack.pop()] = nums[idx];
            }

            stack.push(idx);

        }
        return result;
    }
}