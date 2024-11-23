/*Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and using only constant extra space.

 

Example 1:

Input: nums = [1,3,4,2,2]
Output: 2*/

class Solution {
    public int findDuplicate(int[] nums) {
        
        int slow=nums[0];         
        int fast=nums[0];

        do
        {
            slow=nums[slow];
            fast=nums[nums[fast]];
        }while(slow!=fast);         

        slow=nums[0];
        while(slow!=fast)
        {
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow;
    }
}

/*eg:-nums[1,3,4,2,2]   
here slow=1,fast=1;
then slow=nums[slow]             i.e.slow=3
     fast=nums[nums[fast]]       ie.fast=2

2nd iteration:-   slow=2    fast=4
3rd iteration:-   slow=4    fast=4   therefore slow and fast meet at 3

now slow=nums[0]=1
now incremnet sow and fast by 1 so:-

1st:--   slow=3     fast=2
2nd:--   slow=2     fast=4
2nd:--   slow=4       here they will meet at 2 so return 2;*/
