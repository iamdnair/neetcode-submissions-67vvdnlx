class Solution {
    public int maxProfit(int[] prices) {
          int min= prices[0];
          int max_profit=0;
          int profit=0;
      for(int i=1 ;i<prices.length; i++){
        
        if(prices[i]>min){
            profit=  prices[i] -min ;
            max_profit= Math.max(max_profit, profit);
        }
        else{
          min= prices[i];
        }
    

      }
        return max_profit;
    }
}
