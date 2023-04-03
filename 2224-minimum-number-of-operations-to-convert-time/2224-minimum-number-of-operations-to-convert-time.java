class Solution {
    public int convertTime(String current, String correct) {
        
        if(current.equals(correct) ) return 0;

        int currTime = Integer.parseInt(current.substring(0,2)) *60 + Integer.parseInt(current.substring(3, 5));
        int corrTime = Integer.parseInt(correct.substring(0,2)) *60 + Integer.parseInt(correct.substring(3, 5));
        
        // System.out.println(currTime + " " + corrTime);
        int mins = corrTime - currTime;
        
        int res= 0;
        
        
        while(mins >= 60){
            
            mins-=60;
            res++;
        }
        while( mins >= 15){

            res++;
            mins-=15;


            // if(mins < 15)break;
        }
        while(mins >= 5){

            res++;
            mins-=5;

            // if(mins < 5)break;
        }
        
        return mins + res;

    }
}