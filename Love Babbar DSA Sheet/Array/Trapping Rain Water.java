/*Given an array arr[] with non-negative integers representing the height of blocks. If the width of each block is 1,
compute how much water can be trapped between the blocks during the rainy season. 

Examples:
Input: arr[] = [3, 0, 0, 2, 0, 4]
Output: 10*/

class Solution {
    public int trappingWater(int arr[]) {
        int n = arr.length;
        if (n <= 2) {
          }

        int[] left = new int[n];
        int[] right = new int[n];
        
        left[0] = arr[0];
        right[n - 1] = arr[n - 1];
        
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(arr[i], left[i - 1]);
        }
        
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(arr[i], right[i + 1]);
        }

        int waterTrapped = 0;
        for (int i = 0; i < n; i++) {
            waterTrapped += Math.min(left[i], right[i]) - arr[i];
        }

        return waterTrapped;
    }
}
