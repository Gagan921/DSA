class Solution {
    public int rob(int[] nums) {
        int maxRobbed = 0;
        int maxNotRobbed = 0;

        for(int num: nums) {

            int curRob = maxNotRobbed + num;
            int curNoRob = Math.max(maxNotRobbed, maxRobbed);

            maxRobbed = curRob;
            maxNotRobbed = curNoRob;

        }

        return Math.max(maxRobbed, maxNotRobbed);
    }
}