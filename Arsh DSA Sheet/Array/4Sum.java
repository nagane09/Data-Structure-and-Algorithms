/*Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

0 <= a, b, c, d < n
a, b, c, and d are distinct.
nums[a] + nums[b] + nums[c] + nums[d] == target
You may return the answer in any order.*/

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        List<List<Integer>> arr=new ArrayList<>();
        Arrays.sort(nums);

        if (nums.length < 4) {
            return arr;  // If not enough numbers, return empty list
        }
        
        // Check if the smallest 4 numbers sum to more than target or largest 4 sum to less
        long smallestSum = (long) nums[0] + nums[1] + nums[2] + nums[3];
        long largestSum = (long) nums[nums.length - 1] + nums[nums.length - 2] + nums[nums.length - 3] + nums[nums.length - 4];
        
        if (smallestSum > target || largestSum < target) {
            return arr;  // If no possible quadruplet, return empty list
        }

        for(int i=0;i<nums.length-3;i++)
        {
            if(i>0 && nums[i]==nums[i-1])
            {
                continue;
            }

            for(int j=i+1;j<nums.length-2;j++)
            {
                if(j>i+1 && nums[j]==nums[j-1])
                {
                    continue;
                }

                int left=j+1;
                int right=nums.length-1;

                while(left<right)
                {
                    int sum=nums[i]+nums[j]+nums[left]+nums[right];

                    if(sum==target)
                    {
                        arr.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));

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
                    else if(sum<target)
                    {
                        left++;
                    }
                    else
                    {
                        right--;
                    }
                }

            }
        }
        return arr;

    }
}

/*Sort the Array:
Sorted array: [-2, -1, 0, 0, 1, 2].

First Iteration (nums[i] = -2):

Fix -2 and need to find two numbers that sum to 2 (since target - (-2) = 2).
Pointers: left = 1 (-1), right = 5 (2).
Sum: -2 + (-1) + 2 = -1 (too small), move left pointer to 2.
Sum: -2 + 0 + 2 = 0 (still too small), move left pointer.
Sum: -2 + 1 + 2 = 1 (too large), move right pointer.
Skip duplicate numbers for left and right to avoid repeating.
Second Iteration (nums[i] = -1):

Fix -1, need to find two numbers that sum to 1 (since target - (-1) = 1).
Pointers: left = 2 (0), right = 5 (2).
Sum: -1 + 0 + 2 = 1 (valid triplet found).
Add [-1, 0, 0, 1].*/
