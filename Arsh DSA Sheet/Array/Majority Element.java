/*Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the 
array.
Example 1:
Input: nums = [3,2,3]
Output: 3*/

class Solution {
    public int majorityElement(int[] nums) {
        
        int count=0;
        int candidate=-1;

        for(int i=0;i<nums.length;i++)
        {
            if(count==0)
            {
                candidate=nums[i];
            }
            if(candidate==nums[i])
            {
                count+=1;
            }
            else
            {
                count-=1;
            }
        }
        return candidate;
    }
}

/*{3, 3, 4, 2, 4, 4, 2, 4, 4}
First Pass (find the candidate):

candidate = 3, count = 1 (after first 3)
candidate = 3, count = 2 (after second 3)
candidate = 4, count = 1 (after first 4)
candidate = 4, count = 2 (after second 4)
candidate = 4, count = 3 (after third 4)
candidate = 4, count = 4 (after fourth 4)
The algorithm finally outputs candidate = 4.
Output:

The output will be 4, which is the majority element in this array.*/
