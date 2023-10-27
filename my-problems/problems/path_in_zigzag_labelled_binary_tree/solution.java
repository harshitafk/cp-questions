class Solution {
    public List<Integer> pathInZigZagTree(int label) {
        int size = 1;
        int level = 1;
        LinkedList<Integer> res = new LinkedList<>();
        while ((size << 1) <= label) {
            size <<= 1;
            level++;
        }
        while (label != 0) {
            res.addFirst(label);
            label = ((1 << level) - 1 + (1 << (level - 1)) - label) / 2; 
            level--;
        }
        return res;
    }
}