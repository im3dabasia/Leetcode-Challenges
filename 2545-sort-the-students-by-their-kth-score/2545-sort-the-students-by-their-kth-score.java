class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        
        int[] sortingK = new int[score.length];
        HashMap<Integer, int[]> map = new HashMap<>();
        
        for(int i = 0 ; i <  score.length; i++){
            
            sortingK[i] = score[i][k];
            map.put(score[i][k], score[i]);
        }
        
        Arrays.sort(sortingK);
        int idx = sortingK.length - 1;
        for(int i = 0 ; i < score.length;i++){
            score[i] = map.get(sortingK[idx--]);
        }
        return score;
        
    }
}