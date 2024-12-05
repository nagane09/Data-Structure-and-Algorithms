/*Given an array arr[] that contains positive and negative integers (may contain 0 as well). Find the maximum product that
we can get in a subarray of arr.
Note: It is guaranteed that the output fits in a 32-bit integer.

Examples
Input: arr[] = [-2, 6, -3, -10, 0, 2]
Output: 180
Explanation: The subarray with maximum product is {6, -3, -10} with product = 6 * (-3) * (-10) = 180.*/

class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        // code here
        int MinProduct=arr[0];
        int MaxProduct=arr[0];
        int result=arr[0];
        
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<0)
            {
                int temp=MaxProduct;
                MaxProduct=MinProduct;
                MinProduct=temp;
            }
            MaxProduct=Math.max(arr[i],MaxProduct*arr[i]);
            MinProduct=Math.min(arr[i],MinProduct*arr[i]);
            result=Math.max(result,MaxProduct);
        }
        return result;
    }
}
