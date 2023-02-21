class Solution {
    public int minMaxDifference(int num) {
        String num1 = num + "";
        String max = "";
        String min = "";
        int k =0;
        
        int tempNum = num;
        String start = "";
        
        
        for(int i = 0 ; i < num1.length(); i++){
            if(Integer.parseInt("" +num1.charAt(i)) < 9 ){
                start = "" + num1.charAt(i);
                break;
            }
        }
        // String start = "";
        
        for(int i = 0 ; i < num1.length(); i++){
            if((""+num1.charAt(i)).equals(start)){
                max = max + "9";
            }else{
                max = max + num1.charAt(i);
            }
        }
        // System.out.println(max);
        
//     for minimum
        start = "";
        for(int i = 0 ; i < num1.length(); i++){
            if(Integer.parseInt("" +num1.charAt(i)) > 0 ){
                start = "" + num1.charAt(i);
                break;
            }
        }
        
        for(int i = 0 ; i < num1.length(); i++){
            if((""+num1.charAt(i)).equals(start)){
                min = min + "0";
            }else{
                min = min + num1.charAt(i);
            }
        }
        // System.out.println(min);
        
        return Integer.parseInt(max) - Integer.parseInt(min);
        
    }
}