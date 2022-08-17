/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        double start = 1;
        double end = n;
        double mid = start + ((end - start)/2);
        
        while( start < end){
            mid = start + ((end - start)/2);
            if (isBadVersion((int) mid)){
                
                end = mid  ;
                
            }
            else {
                
                start = mid + 1 ;
                
            }

        }
        return (int) start;
    }
}