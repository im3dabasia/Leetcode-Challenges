class Solution {
    public int[] divisibilityArray(String word, int m) {
        int n = word.length();
        int[] res = new int[word.length()];
        long prefix = 0;
        for (int i = 0; i < n; i++) {
            prefix = (prefix * 10 + (word.charAt(i) - '0')) % m;
            if (prefix == 0) {
                res[i] =  1;
            }
        }
        return res;
    }
}