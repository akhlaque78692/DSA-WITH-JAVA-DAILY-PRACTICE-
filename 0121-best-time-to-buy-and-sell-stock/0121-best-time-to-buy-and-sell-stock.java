class Solution {
    public int maxProfit(int[] prices) {
        int n= prices.length;
        int miniprice = Integer.MAX_VALUE;
        int profit = 0;
        int best_profit=0;
        for(int i=0;i<n;i++){
            miniprice=Math.min(miniprice,prices[i]);
            profit = prices[i] - miniprice;
            best_profit = Math.max(best_profit,profit);
        }
        return best_profit;
    }
}