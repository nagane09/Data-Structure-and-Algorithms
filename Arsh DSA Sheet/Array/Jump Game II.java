/*You are given a 0-indexed array of integers nums of length n. You are initially positioned at nums[0].
Each element nums[i] represents the maximum length of a forward jump from index i. In other words, if you are at nums[i], you can jump to any
nums[i + j] where:
0 <= j <= nums[i] and
i + j < n
Return the minimum number of jumps to reach nums[n - 1]. The test cases are generated such that you can reach nums[n - 1].*/

class Solution {
    public int jump(int[] nums) {
        
        if(nums.length==1)
        {
            return 0;
        }
        int MaxReach=0,jump=0,currentEnd=0;

       for(int i=0;i<nums.length;i++)
       {
            
            MaxReach=Math.max(MaxReach,i+nums[i]);
            
            if(i==currentEnd)
            {
                jump++;
                currentEnd=MaxReach;

                if(MaxReach>=nums.length-1){
                    break;
                }

            }    
       }
       return jump;  

    }
}

/*Dry Run for nums = [2, 3, 1, 1, 4]:
Initialization:

jumps = 0, maxReach = 0, currentEnd = 0
First Iteration (i = 0):

maxReach = max(0, 0 + 2) = 2
i == currentEnd (0 == 0), increment jumps = 1 and set currentEnd = 2
Second Iteration (i = 1):

maxReach = max(2, 1 + 3) = 4
i != currentEnd (1 != 2), continue.
Third Iteration (i = 2):

maxReach = max(4, 2 + 1) = 4
i == currentEnd (2 == 2), increment jumps = 2 and set currentEnd = 4.
Termination:

currentEnd = 4, which is the last index. Return jumps = 2.
Result: 2 jumps*/
