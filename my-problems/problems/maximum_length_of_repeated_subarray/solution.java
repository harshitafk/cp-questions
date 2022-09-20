class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        
        int[][] mat = new int[nums1.length+1][nums2.length+1];
        
        int max = 0;
        for(int i = 1; i < mat.length; i++){
            for(int j = 1; j < mat[0].length; j++){
                
                if(nums1[i-1] == nums2[j-1]){
                    mat[i][j] = mat[i-1][j-1] + 1;
                    max = Math.max(max, mat[i][j]);
                }
            }
        }
        return max;
    }
}