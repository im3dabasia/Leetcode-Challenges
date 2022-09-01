class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        int[][] newArr = new int[image.length][image.length];
        
        int n = image[0].length - 1;
        for(int j = 0; j < image.length; j++){
            
            for(int i = 0; i < image[0].length/2; i++ ){
                
                int temp = image[j][n];
                image[j][n] = image[j][i];
                image[j][i] = temp;
                n--;
                
            }
            n = image[0].length - 1;
        }
        
        //  inversing the numbers
        
        for(int j = 0; j < image.length; j++){
            
            for(int i = 0; i < image[0].length; i++ ){
                
                if(image[j][i] == 0){
                    
                    image[j][i] = 1;
                    
                }
                else{
                    
                    image[j][i] = 0;
                    
                }
            }
        }
        
        return image;
    }
}