class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxProfit = float('inf')
        output = 0
        for n in prices:
            maxProfit = min(maxProfit, n)
            output = max(output, n-maxProfit)
        return output   