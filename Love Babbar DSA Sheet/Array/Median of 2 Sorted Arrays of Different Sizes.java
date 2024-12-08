/*Given two sorted arrays a and b of size m and n respectively. You need to find and return the median of the two sorted arrays.

Note: Assume that the two sorted arrays are merged and then median is selected from the combined array.

Examples:

Input: a[] = [1, 5, 9], b[] = [2, 3, 6, 7]
Output: 5
Explanation: If we merge the arrays and sort them then it will become [1, 2, 3, 5, 6, 7, 9] The middle element for [1, 2, 3, 5, 6, 7, 9] 
is 5*/

class Solution {
    public double fun(int a[], int b[]) {
        int n = a.length;
        int m = b.length;

        // Total length of the merged array
        int totalLength = n + m;
        int midIndex = totalLength / 2;

        int i = 0, j = 0;
        int prev = 0, curr = 0;

        // Merge the two arrays on-the-fly until we reach the middle
        for (int count = 0; count <= midIndex; count++) {
            prev = curr;  // Save the previous value for the median calculation

            if (i < n && (j >= m || a[i] <= b[j])) {
                curr = a[i];
                i++;
            } else {
                curr = b[j];
                j++;
            }
        }

        // If the total length is odd, return the current element as the median
        if (totalLength % 2 != 0) {
            return curr;
        } else {
            // If the total length is even, return the average of the two middle elements
            return (prev + curr) / 2.0;
        }
    }

    public double medianOfSortedArrays(int a[], int b[]) {
        return fun(a, b);
    }
}
