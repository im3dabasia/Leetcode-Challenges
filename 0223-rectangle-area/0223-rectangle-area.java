class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        
        int vertical = Math.abs( by2 - Math.max(ay1, by1));
        int horizontal = Math.abs(ax2 - Math.max(ax1,bx1));

        int area1 = Math.abs((ay2 - ay1) * (ax2 - ax1));
        int area2 = Math.abs((by2 - by1) * (bx2 - bx1));
        
//         Area overlap: to find this we use a intuitive idea
        int horizontalOverlap = Math.min(ax2, bx2) - Math.max(ax1, bx1);
        int verticalOverlap = Math.min(by2 , ay2) - Math.max(ay1, by1);
        
        int areaOverlap = 0;
        if(horizontalOverlap > 0  && verticalOverlap > 0){
            areaOverlap = (horizontalOverlap * verticalOverlap );
        }

        return area1 + area2 - areaOverlap ;







        
    }
}