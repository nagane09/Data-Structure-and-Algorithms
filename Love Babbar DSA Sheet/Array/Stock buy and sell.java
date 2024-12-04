/*If you're allowed to make multiple transactions, the best way to approach this problem is:
Whenever the price is increasing compared to the previous day, you can "buy" at the previous day's price and "sell" at 
the current price. This results in a profit.
Continue this process for every subsequent day.

Input: arr[] = [100, 180, 260, 310, 40, 535, 695]
Output: 865
Explanation: Buy the stock on day 0 and sell it on day 3 => 310 – 100 = 210 Buy the stock on day 4 and sell it on day 
6 => 695 – 40 = 655 Maximum Profit  = 210 + 655 = 865*/

class Solution {
    // Function to find the days of buying and selling stock for max profit.
    int stockBuySell(int arr[]) {
        // code here
        int totalProfit=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>arr[i-1])
            {
                totalProfit+=arr[i]-arr[i-1];
            }
        }
        return totalProfit;
    }
}
