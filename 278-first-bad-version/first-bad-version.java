/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
         long i =1;
         long j = n;
        int idx = -1;
        while(i<=j){
            int mid = (int)(i+(j-i)/2);
            if(mid>0 && isBadVersion(mid) && !isBadVersion(mid-1)){
                idx= mid;
                break;
            }else if(mid>0 && isBadVersion(mid) && isBadVersion(mid-1)){
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        return idx;
    }
}