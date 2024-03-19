class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        i,j=0,1
        while i<=j and j<len(nums):
          if nums[i]==nums[j]:
            del nums[j]
          else:
            i+=1
            j+=1
        return len(nums)