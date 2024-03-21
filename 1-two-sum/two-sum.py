class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        result = [0,0]
        dict_ = {}
        for i in range(len(nums)):
            if(target-nums[i] in dict_):
                return [i, dict_[target - nums[i]]]
            dict_[nums[i]] = i


