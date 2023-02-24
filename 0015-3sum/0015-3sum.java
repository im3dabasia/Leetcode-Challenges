class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> res = new ArrayList<>();
        
        Arrays.sort(nums);

        int low = 0;
        int high = nums.length - 1;
        int sum = 0;
        
        for(int i = 0; i < nums.length - 1; i++){
            low = i + 1;
            high = nums.length - 1;
            sum = 0 - nums[i];
            
            if(i == 0 || (i > 0 && nums[i] != nums[i -1])){
                
                while (low < high){
                    
                    if(sum == nums[low] + nums[high] ){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[low]);
                        temp.add(nums[high]);

                        //Since its sorted and we are already handling duplicated by code below 
                        // no need to check for duplicates in the res DS. it is complicating the algorithm
                        // if(!res.contains(temp)){
                        //     res.add(temp);
                        // }
                            res.add(temp);

                        while( low < high && nums[low] == nums[low + 1]) low++;
                        while( low < high && nums[high] == nums[high - 1]) high--;

                        low++;
                        high--;
                        
                    }

                    else if (sum > nums[low] + nums[high] ) low++;
                        
                    else high--;
            }
        }
    }
        return res;
    }
}




// Approach 1
//         List<List<Integer>> res = new ArrayList<>();
//         for (int i = 0; i < nums.length -2 ; i++){
//             for(int j = i + 1;  j < nums.length -1 ; j++){
//                 List<Integer> temp = new ArrayList<>();
//                 for(int k = j + 1; k < nums.length; k++){
//                     if (nums[i] + nums[j] + nums[k] == 0){
//                         temp.add(nums[i]);
//                         temp.add(nums[j]);
//                         temp.add(nums[k]);
//                         Collections.sort(temp);
//                     }
//                     System.out.println(temp);
//                     if (temp.size() != 0 && !res.contains(temp)){
//                     System.out.println( "222" + temp);
//                             res.add(temp);
//                             // temp.clear();
//                     }
//                     temp.clear();
//                 }
//             }
//         }
//         return res;