class Solution {
    public boolean makesquare(int[] matchsticks) {
        
        if(matchsticks.length < 4) return false;
        
        int target = 0;
        
        for(int i : matchsticks) target += i;
        
        Arrays.sort(matchsticks);
        
        if(target % 4 != 0) return false;
        
        return square(matchsticks,matchsticks.length - 1,0,0,0,0,target/4);
    }
    
    public boolean square(int[] matchsticks, int index, int top, int left, int bottom, int right, int target){
        
        if(top == target && left == target && bottom == target && right == target) return true;
        
        if (top > target || bottom > target || left > target || right > target) return false;
        
        int val = matchsticks[index];
        
        boolean t = square(matchsticks,index-1,top+val,left,bottom,right,target);
        
        if(t) return true;
        
        boolean l = square(matchsticks,index-1,top,left+val,bottom,right,target);
        
        if(l) return true;
        
        boolean b = square(matchsticks,index-1,top,left,bottom+val,right,target);
        
        if(b) return true;
        
        boolean r = square(matchsticks,index-1,top,left,bottom,right+val,target);

        if(r) return true;
        
        return false;
    }
}