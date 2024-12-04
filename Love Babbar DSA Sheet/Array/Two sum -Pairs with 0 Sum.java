/*Given an integer array arr, return all the unique pairs [arr[i], arr[j]] such that i != j and arr[i] + arr[j] == 0.
Note: The pairs must be returned in sorted order, the solution array should also be sorted, and the answer must not 
contain any duplicate pairs.

Examples:
Input: arr = [-1, 0, 1, 2, -1, -4]
Output: [[-1, 1]]
Explanation: arr[0] + arr[2] = (-1)+ 1 = 0.
arr[2] + arr[4] = 1 + (-1) = 0.
The distinct triplets are [-1,1].*/

class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        // code here
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        Arrays.sort(arr);
        int left=0;
        int right=arr.length-1;
        int sum=0;
        
        while(left<right)
        {
            sum=arr[left]+arr[right];
            if(sum==0)
            {
                ArrayList<Integer> pair=new ArrayList<>();
                pair.add(arr[left]);
                pair.add(arr[right]);
                result.add(pair);
                
                while(left<right && arr[left]==arr[left+1])
                {
                    left++;
                }
                while(right>left && arr[right]==arr[right-1])
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
        return result;
        
    }
}
