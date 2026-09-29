class Solution {
    public int maxProfit(int[] prices) {
        int buyStockPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(buyStockPrice<prices[i]){
                int profit=prices[i]-buyStockPrice;
                maxProfit=Math.max(maxProfit,profit);
            }else{
                buyStockPrice=prices[i];
            }
        }

        return maxProfit;
    }
}
