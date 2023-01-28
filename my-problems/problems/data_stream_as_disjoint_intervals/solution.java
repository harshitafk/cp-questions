class SummaryRanges {

    private TreeMap<Integer,Integer> intervals;
    public SummaryRanges() {
        intervals = new TreeMap<>();
    }
    
    public void addNum(int value) {
        final Map.Entry<Integer,Integer> smallEntry = intervals.floorEntry(value);

        int left = value, right = value;
        if(smallEntry != null){
            int previous = smallEntry.getValue();
            if(previous >= value){
                return;
            }

            if(previous == value-1){
                left = smallEntry.getKey();
            }
        }

        final Map.Entry<Integer, Integer> maxEntry = intervals.higherEntry(value);

        if(maxEntry != null && maxEntry.getKey() == value+1){
            right = maxEntry.getValue();
            intervals.remove(value+1);
        }
        intervals.put(left,right);
    }
    
    public int[][] getIntervals() {
        final int[][] array = new int[intervals.size()][2];
        int ind = 0;
        for(Map.Entry<Integer,Integer> map : intervals.entrySet()){
            array[ind][0] = map.getKey();
            array[ind++][1] = map.getValue();
        }
        
        return array;
    }
}

/**
 * Your SummaryRanges object will be instantiated and called as such:
 * SummaryRanges obj = new SummaryRanges();
 * obj.addNum(value);
 * int[][] param_2 = obj.getIntervals();
 */