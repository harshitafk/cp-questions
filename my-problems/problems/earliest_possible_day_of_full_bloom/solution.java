class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        int n = plantTime.length;
        
        Pair[] pairs = new Pair[n];
        
        for(int i = 0; i < n; i++){
            pairs[i] = new Pair(plantTime[i], growTime[i]);
        }
        
        Arrays.sort(pairs, (a,b) -> b.growTime - a.growTime);
        
        int total = 0;
        int plantingDays = 0;
        for(Pair pair : pairs){
            total = Math.max(total,plantingDays + pair.plantTime + pair.growTime);
            plantingDays += pair.plantTime;
        }
        
        return total;
    }
}

class Pair{
    int plantTime;
    int growTime;
    
    public Pair(int plantTime, int growTime){
        this.plantTime = plantTime;
        this.growTime = growTime;
    }
}