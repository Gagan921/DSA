class Solution {
    public int maxSubArray(int[] nums) {
        int sum =0;
        int result = Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++){
            sum+=nums[i];
            if(sum<0){
                sum =0;
            }
           result = Math.max(result, sum);
        }
        if(result==0){
           result = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            result = Math.max(result, nums[i]);
        }
        }
        return result;
    }
}