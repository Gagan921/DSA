class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        obj = {}
        for i in range(len(nums)):
            if nums[i] in obj and abs(i-obj[nums[i]])<=k:
                return True
            obj[nums[i]] = i
        return False;       
