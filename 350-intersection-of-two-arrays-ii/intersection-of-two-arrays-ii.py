class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
       result = []
       my_dict = defaultdict(int)  # Use defaultdict to handle missing keys

        # Count occurrences in nums1
       for num in nums1:
            my_dict[num] += 1

        # Check occurrences in nums2 and add to result
       for num in nums2:
            if num in my_dict and my_dict[num] > 0:
                result.append(num)
                my_dict[num] -= 1  # Decrement count

       return result
