/*You are given three arrays sorted in increasing order. Find the elements that are common in all three arrays.
If there are no such elements return an empty array. In this case, the output will be -1.
Note: can you handle the duplicates without using any additional Data Structure?

Examples :
Input: arr1 = [1, 5, 10, 20, 40, 80] , arr2 = [6, 7, 20, 80, 100] , arr3 = [3, 4, 15, 20, 30, 70, 80, 120]
Output: [20, 80]
Explanation: 20 and 80 are the only common elements in arr, brr and crr.
Input: arr1 = [1, 2, 3, 4, 5] , arr2 = [6, 7] , arr3 = [8,9,10]
Output: [-1]
Explanation: There are no common elements in arr, brr and crr.*/

class Solution {
    // Function to find common elements in three sorted arrays
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2, List<Integer> arr3) {
        List<Integer> result = new ArrayList<>();
        
        int i = 0, j = 0, k = 0;
        
        while (i < arr1.size() && j < arr2.size() && k < arr3.size()) {
            int a1 = arr1.get(i), a2 = arr2.get(j), a3 = arr3.get(k);
            
            if (a1 == a2 && a2 == a3) {
                if (result.isEmpty() || result.get(result.size() - 1) != a1) {
                    result.add(a1);
                }
                i++;
                j++;
                k++;
            }
            else if (a1 < a2) {
                i++;
            } else if (a2 < a3) {
                j++;
            } else {
                k++;
            }
        }
        
        return result;
    }
}
