/*Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, 
with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

 Example 1:
 Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]*/

import java.util.*;
class Solution {

    public void swap(int[] nums,int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void sortColors(int[] nums) {


        int mid=0;
        int low=0;
        int high=nums.length-1;

        while(mid<=high)
        {
            if(nums[mid]==0)
            {
                swap(nums,low,mid);
                mid++;
                low++;
            }
            else if(nums[mid]==1)
            {
                mid++;
            }
            else
            {
                swap(nums,mid,high);
                high--;
            }
        }
        
    }
    public static void main(String[] args)
    {
        Solution sc=new Solution();
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i=0;i<nums.size();i++)
        {
            System.out.print(nums.get(i)+" ");
        }
    }
}

/*nums = [2,0,2,1,1,0]
nums[mid]=2,  nums[low]=2,  nums[high]=0
1st:---   mid=2 so swap with high    nums=[0,0,2,1,1,2]   
                high--   so  nums[high]=1
2nd:---   mid=0 so swap with low=0   nums=[0,0,2,1,1,2]
                mid++   and   low++   
                nums[mid]=0   and   nums[low]=0
3rd:---    mid=0 so swap with low=0   nums=[0,0,2,1,1,2]
                mid++   and   low++   
                nums[mid]=2   and   nums[low]=2
4th:---    mid=2  so swap with high    nums=[0,0,1,1,2,2]   
                high--   so  nums[high]=1
5th:---    mid=1   so mid++  


NOW mid<=high so stop the pocess and return array*/
