/*Given an array arr and a number k. One can apply a swap operation on the array any number of times, i.e choose any two index i and j 
(i < j) and swap arr[i] , arr[j] . Find the minimum number of swaps required to bring all the numbers less than or equal to k together, 
i.e. make them a contiguous subarray.
Examples :
Input: arr[] = [2, 1, 5, 6, 3], k = 3
Output: 1
Explanation: To bring elements 2, 1, 3 together, swap index 2 with 4 (0-based indexing), i.e. element arr[2] = 5 with arr[4] = 3 
such that final array will be- arr[] = [2, 1, 3, 6, 5]*/

class Solution {
    // Function for finding maximum and value pair
    int minSwap(int[] arr, int k) {
        // Complete the function
        int bad=0;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=k)
            {
                count++;
            }
        }
        for(int i=0;i<count;i++)
        {
            if(arr[i]>k)
            {
                bad++;
            }
        }
        int ans=bad;
        for(int i=0,j=count;j<arr.length;j++,i++)
        {
            if(arr[i]>k)
            {
                ans--;
            }
            if(arr[j]>k)
            {
                ans++;
            }
            ans=Math.min(ans,bad);
        }
        return ans;
    }
}
