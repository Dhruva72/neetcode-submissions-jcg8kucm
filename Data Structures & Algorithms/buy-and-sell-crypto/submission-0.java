class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = prices[0];

        for(int i=1;i<prices.length;i++){
            if(prices[i]<buy){
                buy = prices[i];
            }
            else{
                int current_p = prices[i] - buy;
                profit = Math.max(current_p,profit);
            }
       }
       return profit;
    }
}
