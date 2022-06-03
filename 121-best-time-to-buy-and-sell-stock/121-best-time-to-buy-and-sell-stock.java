class Solution {
    public int maxProfit(int[] prices) {
        
        int minPriceIdx = 0;
        int maxProfit = 0;
        for(int curPriceIdx=0; curPriceIdx<prices.length; curPriceIdx++){
            if(prices[minPriceIdx] > prices[curPriceIdx]){
                minPriceIdx = curPriceIdx;
            }
            else{
                maxProfit = Math.max(maxProfit, (prices[curPriceIdx]-prices[minPriceIdx]));
            }
            
        }
        
        return maxProfit;
    }
}