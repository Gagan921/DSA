class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        i = 0
        count=0
        j = len(nums)-1
        while i<=j:
            if nums[i]!=0:
                nums[count]=nums[i]  
                count+=1
            i+=1       

        while(count<=j):
            nums[count] = 0
            count+=1