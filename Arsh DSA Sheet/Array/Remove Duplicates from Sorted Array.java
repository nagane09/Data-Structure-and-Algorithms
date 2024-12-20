/*Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only 
once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially.
The remaining elements of nums are not important as well as the size of nums.
Return k.*/

class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;

        for(int j=1;j<nums.length;j++)
        {
            if(nums[j]!=nums[i])
            {
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}


/*  nums=[1,1,2]    here i=0   nums[i]=1
                         j=1   nums[j]=1
1st:----     here nums[i]=nums[j]    so skip  j++,i++
2nd:----     here nums[i]!=nums[j]   so nums[i]=nums[j]
                    so nums=[1,2,2]*/

                so return*/
