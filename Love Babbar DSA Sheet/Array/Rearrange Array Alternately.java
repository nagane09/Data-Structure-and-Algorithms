/*Given an array of positive integers. Your task is to rearrange the array elements alternatively i.e. first element
  should be the max value, the second should be the min value, the third should be the second max, the fourth should 
  be the second min, and so on.
Note: Modify the original array itself. Do it without using any extra space. You do not have to return anything.

Examples:

Input: arr[] = [1, 2, 3, 4, 5, 6]
Output: [6, 1, 5, 2, 4, 3]
Explanation: Max element = 6, min = 1, second max = 5, second min = 2, and so on... The modified array is:
[6, 1, 5, 2, 4, 3]*/

class Solution {

    // temp: input array
    // n: size of array
    // Function to rearrange  the array elements alternately.
    public static void rearrange(int arr[]) {

        // Your code here
        Arrays.sort(arr);
        int[] result = new int[arr.length];
        int left=0,right=arr.length-1,index=0;
        while(left<=right)
        {
            if(index%2==0)
            {
                result[index]=arr[right];
                right--;
            }
            else
            {
                result[index]=arr[left];
                left++;
            }
            index++;
            
        }
        System.arraycopy(result, 0, arr, 0, arr.length);

    }
}
