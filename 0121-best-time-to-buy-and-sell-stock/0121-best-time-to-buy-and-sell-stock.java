class Solution {
    public int maxProfit(int[] prices) {
        int min_so_far=prices[0];
        int max_profit=0;
        for(int i=0;i<prices.length;i++){
            min_so_far=Math.min(min_so_far,prices[i]);
            int profit= prices[i]-min_so_far;
            max_profit=Math.max(max_profit,profit);
        }
        return max_profit;
    }
}