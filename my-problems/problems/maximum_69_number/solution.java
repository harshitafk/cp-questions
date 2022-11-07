class Solution {
    public int maximum69Number (int num) {
        int mult = 1, temp = num;
        int max = Integer.MIN_VALUE;
        while(temp > 0){
            int mod = temp % 10;
            if(mod == 6){
                max = Math.max(((3 * mult) + num), max);
            }
            temp = temp / 10;
            mult = mult * 10;
        }

        return max==Integer.MIN_VALUE ? num : max;
    }
}