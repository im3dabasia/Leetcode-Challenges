class Solution {
    public boolean primeSubOperation(int[] nums) {
        
        if(nums.length ==1) return true;
        
        List<Integer> primes = getPrimes(1000);
                for (int i = nums.length; i >= 2; i--) {
            if (nums[i - 2] >= nums[i - 1]) {
                int index = -1;
                for (int primeIndex = 0; primeIndex < primes.size(); primeIndex++) {
                    if (primes.get(primeIndex) >= nums[i - 2]) {
                        break;
                    }
                    
                    if (nums[i - 2] - primes.get(primeIndex) < nums[i - 1]) {
                        index = primeIndex;
                        break;
                    }
                }
                if (index == -1) {
                    return false;
                }
                nums[i - 2] = nums[i - 2] - primes.get(index);
            }
        }
        return true;
        
        
        
    }
    
    private static boolean isPrime(int n){
      if(n==1||n==0)return false;

      for(int i=2; i<n; i++){
            if(n%i==0)return false;
      }
      return true;
    }
    
    private List<Integer> getPrimes(int n){
        
        List<Integer> temp = new ArrayList<>();
        for(int i=0; i<=n; i++){

            if(isPrime(i)) {
                temp.add(i);
            }
        }
        return temp;
    }
}