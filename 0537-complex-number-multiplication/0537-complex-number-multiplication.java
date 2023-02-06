class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        
        boolean flag = false;
        String a = "";
        String b = "";
        String c = "";
        String d = "";
        
        for(int i =0; i < num1.length() -1; i++){
            if(num1.charAt(i) == '+'){
                flag = true;
                continue;
            }
            if(flag  == false){
                a = a+num1.charAt(i);
            }else{
                b = b + num1.charAt(i);
            }
        }
        
        flag = false;
        for(int i =0; i < num2.length() - 1; i++){
            if(num2.charAt(i) == '+' ){
                flag = true;
                continue;
            }
            if(flag  == false){
                c = c+num2.charAt(i);
            }else{
                d = d + num2.charAt(i);
            }
        }
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);
        // System.out.println(d);
        
        
        int ans_a = Integer.parseInt(a) * Integer.parseInt(c);
        int ans_b = Integer.parseInt(a) * Integer.parseInt(d) +  Integer.parseInt(b) * Integer.parseInt(c) ;
        int ans_c = (Integer.parseInt(b) * Integer.parseInt(d) )* -1;
        
        return   (ans_a + ans_c) + "+" + ans_b +"i";
    }
}