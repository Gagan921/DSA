class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        set1 = set(nums1)
        set2 = set(nums2)
        result_set = set1.intersection(set2)
        result_list = list(result_set)
        return result_list   

        