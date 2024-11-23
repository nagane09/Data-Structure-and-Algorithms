/*Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and 
nums[i] + nums[j] + nums[k] == 0.
Notice that the solution set must not contain duplicate triplets.*/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> arr=new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0;i<nums.length-2;i++)
        {
            if(i>0 && nums[i]==nums[i-1])
            {
                continue;
            }
            int left=i+1;
            int right=nums.length-1;

            while(left<right)
            {
                int sum=nums[i]+nums[left]+nums[right];

                if(sum==0)
                {
                    arr.add(Arrays.asList(nums[i],nums[left],nums[right]));

                    while(left<right && nums[left]==nums[left+1])
                    {
                        left++;
                    }
                    while(left<right && nums[right]==nums[right-1])
                    {
                        right--;
                    }

                    left++;
                    right--;
                }
                else if(sum<0)
                {
                    left++;
                }
                else
                {
                    right--;
                }
            }
        }
        return arr;


    }

}

/*Input:
nums = [-1, 0, 1, 2, -1, -4]

Sorted array: [-4, -1, -1, 0, 1, 2]

First Iteration (nums[i] = -4):
------------------------------------------------------------------------------
Need to find two numbers that sum to 4.
Pointers: left = -1, right = 2
Sum: -4 + (-1) + 2 = -3 (less than zero) → Move left pointer.
No valid triplet found for i = -4.

Second Iteration (nums[i] = -1):
------------------------------------------------------------------------------
Need to find two numbers that sum to 1.
Pointers: left = -1, right =2
Sum: -1 + (-1) + 2 = 0 → Valid triplet: [-1, -1, 2].
Skip duplicates: Move left = 3 and right = 4.
Sum: -1 + 0 + 1 = 0 → Valid triplet: [-1, 0, 1].

Third Iteration (nums[i] = 0):
------------------------------------------------------------------------------
Need to find two numbers that sum to 0.
Pointers: left = 1 (1), right = 4 (2)
Sum: 0 + 1 + 2 = 3 (greater than zero) → Move right pointer.
No valid triplet found for i = 0.
Stop at i = 4: No more possible triplets.*/
