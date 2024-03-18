class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        n = set(nums)
        if len(nums)!=len(n): 
            return True
        return False