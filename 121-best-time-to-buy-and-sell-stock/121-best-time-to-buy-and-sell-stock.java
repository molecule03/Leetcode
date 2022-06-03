class Solution {
    public int maxProfit(int[] prices) {
        
        int min = 0;
        int maxProfit = 0;
        for(int i=0; i<prices.length; i++){
            if(prices[min] > prices[i]){
                min = i;
            }
            else{
                // System.out.println(prices[min]-prices[i]);
                maxProfit = Math.max(maxProfit, (prices[i]-prices[min]));
            }
            
            // System.out.println(min+" "+i+" "+maxProfit);
        }
        
        return maxProfit;
    }
}