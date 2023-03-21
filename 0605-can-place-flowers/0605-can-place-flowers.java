class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {
        
        int cnt = 0;
        
        for(int i = 0; i < arr.length; i++){
            
            boolean emptyLeft = (i == 0) || arr[i - 1] == 0;
            boolean emptyRight = (i == arr.length - 1) || arr[i + 1] == 0;
            
            
            if(emptyLeft && emptyRight){
                // System.out.println(i);
                if(arr[i] != 1) cnt++;
                
                arr[i] = 1;
                
                // cnt++;
            }
            // System.out.println(Arrays.toString(arr));
            
        }
        // System.out.println(cnt);
        return cnt >= n;
    }
}