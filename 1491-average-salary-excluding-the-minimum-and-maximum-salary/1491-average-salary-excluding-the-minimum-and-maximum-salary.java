class Solution {
    public double average(int[] salary) {
        
        int min = 1000000;
        int max = -1000000;
        double sum = 0;
        for(int i =0; i < salary.length; i++){
            
            sum+= salary[i];
            
            if(salary[i] > max){
                max = salary[i];
            }
            if(salary[i] < min){
                min = salary[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
        
        sum = sum - min - max;
        
        return sum/(salary.length-2);
        
    }
}