class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;
        int minBuyPrice = prices[0];
        if(n == 0){
            return 0;
        }
        for(int i = 1; i< n; i++){
            minBuyPrice = Math.min(minBuyPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minBuyPrice);
        }
        return maxProfit;
    }
}