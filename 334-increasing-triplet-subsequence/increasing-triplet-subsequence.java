class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for( int n : nums){
            if(n<first){
                first =n;
            }else if(n>first && n<second){
                second=n;
            }else if(n>first && n>second){
                return true;
            }
        }
         return false;
    }
}