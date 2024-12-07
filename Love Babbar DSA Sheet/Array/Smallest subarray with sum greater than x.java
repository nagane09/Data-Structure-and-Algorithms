/*Given a number x and an array of integers arr, find the smallest subarray with sum greater than the given value. If such a subarray do not exist return 0 in that case.
Examples:
Input: x = 51, arr[] = [1, 4, 45, 6, 0, 19]
Output: 3
Explanation: Minimum length subarray is [4, 45, 6]*/

class Solution {

    public static int smallestSubWithSum(int x, int[] arr) {
        // Your code goes here
        int minLen=Integer.MAX_VALUE;
        int sum=0;
        int left=0;
        int right=0;
        
        for(right=0;right<arr.length;right++)
        {
            sum+=arr[right];
            while(sum>x)
            {
                minLen=Math.min(minLen,right-left+1);
                sum-=arr[left];
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
