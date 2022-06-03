class Solution {
    public int maxProfit(int[] prices) {
        
        int minPriceIdx = 0;
        int maxProfit = 0;
        for(int curPriceIdx=0; curPriceIdx<prices.length; curPriceIdx++){
            if(prices[minPriceIdx] > prices[curPriceIdx]){
                minPriceIdx = curPriceIdx;
            }
            else{
                int curProfit = prices[curPriceIdx]-prices[minPriceIdx];
                maxProfit = Math.max(maxProfit, curProfit);
            }
            
        }
        
        return maxProfit;
    }
}