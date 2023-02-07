class Solution {
    public int[] findArray(int[] pref) {
        int[] res = new int[pref.length];
        res[0] = pref[0];
        int inter =0;
        for(int i = 1; i < pref.length ; i++){
             inter = inter ^ res[i - 1];
            res[i] = inter ^ pref[i];
        }
        return res;
    }
    
    // private int helper(int[] arr){
    //     int ans = 0;
    //     for(int i =0; i< arr.length; i++){
    //         ans = ans ^ arr[i];
    //     }
    //     return ans;
    // }
}