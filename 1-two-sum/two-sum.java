class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hp = new HashMap();
        int [] result = new int[2];
        for(int i =0;i<nums.length;i++){
            if(hp.containsKey(target - nums[i])){
                result[0] = hp.get(target - nums[i]);
                result[1] = i;
        }
            hp.put(nums[i], i);
        }
        return result;
    }
}