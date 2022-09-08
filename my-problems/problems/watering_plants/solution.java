class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int ans = 0, curr = capacity;
        
        for(int i = 0; i < plants.length; i++){
            
            if(plants[i] > curr){
                curr = capacity;
                ans += 2 * i;
            }
            
            ans++;
            curr = curr - plants[i];
        }
        return ans;
    }
}