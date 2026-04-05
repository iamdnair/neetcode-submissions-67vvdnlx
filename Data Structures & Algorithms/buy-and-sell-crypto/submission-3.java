class Solution {
    public int maxProfit(int[] prices) {
        int MaxProfit=0;
        for(int i=0;i< prices.length; i++){
            for(int j=i+1; j< prices.length;j++){
              int  profit=prices[j]- prices[i];
                MaxProfit=Math.max(MaxProfit,profit);
            }

        }
      return MaxProfit;
        
    }
}
