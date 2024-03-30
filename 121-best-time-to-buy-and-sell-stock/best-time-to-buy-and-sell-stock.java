class Solution {
    public int maxProfit(int[] prices) {
        int minEle = Integer.MAX_VALUE;
        int result  = Integer.MIN_VALUE;
        for(int i = 0;i<prices.length;i++){
            minEle = Math.min(minEle, prices[i]);
            result = Math.max(result, prices[i]-minEle);
        }
        return result;
    }
}