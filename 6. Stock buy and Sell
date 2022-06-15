class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 1)    return 0;
        int min = Integer.MAX_VALUE, profit = 0;
        for(int i=0; i<prices.length; i++){
            if(prices[i]<min)   min=prices[i];
            if(profit<prices[i]-min)    profit=prices[i]-min;
        }
        return profit;
    }
}
