class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int areaA = (ay2 - ay1) * (ax2 - ax1);
        int areaB = (by2 - by1) * (bx2 - bx1);

        int area = areaA + areaB;

        int xOv = Math.min(ax2,bx2) - Math.max(ax1,bx1);
        int yOv = Math.min(ay2,by2) - Math.max(ay1,by1);

        int common = 0;
        if(xOv > 0 && yOv > 0){
            common = xOv * yOv;
        }

        return (area - common);
    }
}