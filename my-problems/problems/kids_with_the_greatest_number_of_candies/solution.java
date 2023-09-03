class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int gint = findgreatest(candies);
        
        List<Boolean> list = new ArrayList<>();
        for(int i = 0; i < candies.length; i++){
            
            if(candies[i] + extraCandies >= gint)
            list.add(true);
            else list.add(false);
        }
        
        return list;
    }

    private int findgreatest(int[] candies){
        int great = 0;

        for(int i = 0; i < candies.length; i++){
            if(candies[i] > great) great = candies[i];
        }

        return great;
    }
}