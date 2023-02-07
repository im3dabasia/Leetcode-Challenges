class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {

        
        int[] temp = new int[points.length];
        for(int i =0; i < points.length;i++){
            temp[i] = points[i][0];
        }
        
        Arrays.sort(temp);
        
        int max = Integer.MIN_VALUE;
        
        for(int i =temp.length - 1; i >0; i-- ){
            int pre = temp[i] - temp[i - 1];
            System.out.println(temp[i]);
            max = Math.max(max, pre);
        }
        
        return max;
    }
}

