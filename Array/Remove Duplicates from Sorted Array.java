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
                    so nums=[1,2,2]

                so return*/
