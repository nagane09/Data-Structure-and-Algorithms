/*Given an array arr[] of integers, calculate the median.
NOTE: Return the floor value of the median

Examples:

Input: arr[] = [90, 100, 78, 89, 67]
Output: 89
Explanation: After sorting the array middle element is the median */

class Solution {
    public int findMedian(List<Integer> arr) {
        // Code here.
        Collections.sort(arr);
        int n=arr.size();
        if(arr.size()%2!=0)
        {
            return arr.get(n/2);
        }
        else
        {
            int i=(n/2)-1;
            int j=(n/2);
            int ans=(arr.get(i)+arr.get(j))/2;
            return ans;
        }
    }
}
