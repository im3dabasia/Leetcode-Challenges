class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        
        int[] order = new int[score.length];
        int[] temp = new int[score.length];
        
        for(int i =0; i < score.length; i++){
            temp[i] = score[i][k];
        }

        Arrays.sort(temp);
        System.out.println(Arrays.toString(temp));
        
        int[][] res = new int[score.length][score[0].length];
        for(int i =0; i< score.length; i++){
            for(int j = 0; j < score.length; j++){
                if(temp[temp.length - 1 - i] == score[j][k]){
                    res[i] = score[j];
                }
            }
        }
        return res;
    }
    
//     private void swapper(int posA, int posB, int[][] score){
        
//         int[] temp = score[posA];
//         score[posA] = score[posB];
//         score[posB] = temp;
        
//     }
}