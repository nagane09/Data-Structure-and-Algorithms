class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int[] arr) {

        // Your code here
        int currSum=0;
        int MaxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            currSum+=arr[i];
            MaxSum=Math.max(MaxSum,currSum);
            if(currSum<0)
            {
                currSum=0;
            }
        }
        return MaxSum;
    }
}
