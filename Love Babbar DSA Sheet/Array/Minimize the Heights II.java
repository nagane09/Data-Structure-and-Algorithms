/*Input: k = 2, arr[] = {1, 5, 8, 10}
Output: 5
Explanation: The array can be modified as {1+k, 5-k, 8-k, 10-k} = {3, 3, 6, 8}.The difference between the largest and 
the smallest is 8-3 = 5.*/

class Solution {
    int getMinDiff(int[] arr, int k) {
        // code here
        if (arr == null || arr.length <= 1) {
            return 0;
        }
        int n=arr.length;
        Arrays.sort(arr);
        int result=arr[n-1]-arr[0];
        
        for(int i=1;i<n;i++)
        {
            if(arr[i]-k<0)
            {
                continue;
            }
            int MaxDiff = Math.max(arr[i-1] + k, arr[n-1] - k);
            int MinDiff = Math.min(arr[0] + k, arr[i] - k);


            result=Math.min(result,MaxDiff-MinDiff);
        }
        return result;
    }
}


//we are maxzimizing the small element and minimizing  the large element 
