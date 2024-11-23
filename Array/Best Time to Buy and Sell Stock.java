/*You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.*/

class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int minProfit=Integer.MAX_VALUE;

        for(int i=0;i<prices.length;i++)
        {
            minProfit=Math.min(minProfit,prices[i]);
            int profit=prices[i]-minProfit;
            maxProfit=Math.max(maxProfit,profit);
        }
        return maxProfit; 
        
    }
    public static void main(String[] args)
    {
        Solution obj=new Solution();
        ArrayList<Integer> arr=new ArrayList<>();
        int[] prices=new int[arr.size()];

        for(int i=0;i<arr.size();i++)
        {
            prices[i]=arr.get(i);
        }
        System.out.print(obj.maxProfit(prices));
    } 
}
/*Iteration:
First Day (Price = 7):

We compare the current price (7) with minPrice. Since 7 < Integer.MAX_VALUE, we update minPrice to 7.
The potential profit is price - minPrice = 7 - 7 = 0. Since it's 0, maxProfit remains 0.
Second Day (Price = 1):

We compare the current price (1) with minPrice. Since 1 < 7, we update minPrice to 1.
The potential profit is 1 - 1 = 0. Since it's 0, maxProfit remains 0.
Third Day (Price = 5):

We compare the current price (5) with minPrice. Since 5 > 1, minPrice remains 1.
The potential profit is 5 - 1 = 4. Since 4 > 0, we update maxProfit to 4.
Fourth Day (Price = 3):

We compare the current price (3) with minPrice. Since 3 > 1, minPrice remains 1.
The potential profit is 3 - 1 = 2. Since 2 < 4, maxProfit remains 4.
Fifth Day (Price = 6):

We compare the current price (6) with minPrice. Since 6 > 1, minPrice remains 1.
The potential profit is 6 - 1 = 5. Since 5 > 4, we update maxProfit to 5.
Sixth Day (Price = 4):

We compare the current price (4) with minPrice. Since 4 > 1, minPrice remains 1.
The potential profit is 4 - 1 = 3. Since 3 < 5, maxProfit remains 5.*/
