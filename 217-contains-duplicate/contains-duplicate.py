class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        obj = {}
        for num in nums:
           if num in obj:
            return True
           else:
             obj[num]=1

        return False      