class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int[] result = {-1, -1};

        if (nums.length == 1 && nums[0] == target) {
            return new int[]{0, 0};
        }

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                // Find the left boundary of the target range
                int start = mid;
                while (start > 0 && nums[start - 1] == target) {
                    start--;
                }
                // Find the right boundary of the target range
                int end = mid;
                while (end < nums.length - 1 && nums[end + 1] == target) {
                    end++;
                }
                return new int[]{start, end};
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}
