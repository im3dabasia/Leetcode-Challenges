class Solution {
    public boolean lemonadeChange(int[] nums) {
        
        int money_5  = 0;
        int money_10 = 0;
        int money_20 = 0;
        
        for(int i = 0; i  < nums.length; i++){
            
            if(nums[i] == 5){
                money_5++;
            }else if(nums[i] == 10){
                money_10++;
                
                if(money_5 > 0){
                    money_5--;
                }else{
                    System.out.println("333de");
                    
                    return false;
                }
            }else{
                money_20++;
                
                if(  money_5 > 0 && money_10 >0){
                    money_5--;
                    money_10--;
                }else if(money_5 >= 3 ){
                    money_5 = money_5 - 3;

                }
                else{
                    // System.out.println(money_5 + ' ' + money_10 + ' ' + money_20);
                    System.out.println("hello");
                    return false;
                }
            }
        }
        return true;
        
    }
}