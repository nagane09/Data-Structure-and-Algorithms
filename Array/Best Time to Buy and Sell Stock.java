class Solution {
    public int maxProfit(int[] prices) {
        int []bestBuy=new int[prices.length];
        bestBuy[0]=Integer.MAX_VALUE;
        for(int i=1;i<prices.length;i++)
        {
            bestBuy[i]=Math.min(prices[i-1],bestBuy[i-1]);

        }
        int maxProfit=0;
        for(int i=0;i<prices.length;i++)
        {
            int currMax=prices[i]-bestBuy[i];
            maxProfit=Math.max(currMax,maxProfit);
        }
        return maxProfit;
    }
}
