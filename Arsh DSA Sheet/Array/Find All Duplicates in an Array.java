/*Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears at most twice, 
return an array of all the integers that appears twice.

You must write an algorithm that runs in O(n) time and uses only constant auxiliary space, excluding the space needed to store the
output

Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]*/

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            
            int index = Math.abs(nums[i]) - 1; 
// If the number at this index is negative, it means we've seen this number before
            if (nums[index] < 0) {
                result.add(Math.abs(nums[i]));  // Add to result
            } else {
// Otherwise, negate the value at the corresponding index to mark it as seen
                nums[index] = -nums[index];
            }
        }
        
        return result;
    }

}

/*Example Walkthrough:
For nums = [4, 3, 2, 7, 8, 2, 3, 1]:

Step 1 (i = 0, nums[i] = 4):

Calculate index = |4| - 1 = 3.
nums[3] = 7 (positive), so negate it: nums[3] = -7.
Step 2 (i = 1, nums[i] = 3):

Calculate index = |3| - 1 = 2.
nums[2] = 2 (positive), so negate it: nums[2] = -2.
Step 3 (i = 2, nums[i] = -2):

Calculate index = | -2 | - 1 = 1.
nums[1] = 3 (positive), so negate it: nums[1] = -3.
Step 4 (i = 3, nums[i] = -7):

Calculate index = | -7 | - 1 = 6.
nums[6] = 3 (negative), which means this is a duplicate. Add 3 to the result.
Step 5 (i = 4, nums[i] = 8):

Calculate index = |8| - 1 = 7.
nums[7] = 1 (positive), so negate it: nums[7] = -1.
Step 6 (i = 5, nums[i] = 2):

Calculate index = |2| - 1 = 1.
nums[1] = -3 (negative), so add 2 to the result.
Step 7 (i = 6, nums[i] = 3):

Calculate index = |3| - 1 = 2.
nums[2] = -2 (negative), so add 3 to the result.
Step 8 (i = 7, nums[i] = 1):

Calculate index = |1| - 1 = 0.
nums[0] = 4 (positive), so negate it: nums[0] = -4.
Finally, the result is [2, 3].*/
