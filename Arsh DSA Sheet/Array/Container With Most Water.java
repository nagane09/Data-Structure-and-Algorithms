/*You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0)
  and (i, height[i]).
Find two lines that together with the x-axis form a container, such that the container contains the most water.
Return the maximum amount of water a container can store.*/

class Solution {
    public int maxArea(int[] height) {
        
        int left=0;
        int right=height.length-1;
        int maxArea=0;

        while(left<right)
        {
            int Area=Math.min(height[left],height[right])*(right-left);  //for area calculation
            maxArea=Math.max(maxArea,Area);
        
            if(height[left]<height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return maxArea;

    }
}

/*Steps:
left = 0, right = 8: Area = 8 → maxArea = 8, move left++ → left = 1
left = 1, right = 8: Area = 49 → maxArea = 49, move right-- → right = 7
left = 1, right = 7: Area = 18 → maxArea = 49, move right-- → right = 6
left = 1, right = 6: Area = 40 → maxArea = 49, move right-- → right = 5
left = 1, right = 5: Area = 16 → maxArea = 49, move right-- → right = 4
left = 1, right = 4: Area = 15 → maxArea = 49, move right-- → right = 3
left = 1, right = 3: Area = 4 → maxArea = 49, move right-- → right = 2
left = 1, right = 2: Area = 6 → maxArea = 49, move right-- → right = 1
End: maxArea = 49*/
