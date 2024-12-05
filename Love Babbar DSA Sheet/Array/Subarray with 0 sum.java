/*Given an array of integers, arr[]. Find if there is a subarray (of size at least one) with 0 sum. Return true/false depending upon whether there is a subarray present with 0-sum or not. 
Examples:
Input: arr[] = [4, 2, -3, 1, 6]
Output: true
Explanation: 2, -3, 1 is the subarray with a sum of 0.*/

class Solution {
    // Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[]) {
        // Your code here
        HashSet<Integer> sett=new HashSet<>();
        int PrefixSum=0;
        
        for(int i=0;i<arr.length;i++)
        {
            PrefixSum+=arr[i];
            
            if(PrefixSum==0 || sett.contains(PrefixSum))
            {
                return true;
            }
            sett.add(PrefixSum);
        }
        return false;
    }
}
