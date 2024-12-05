/*Given an array arr[] of non-negative integers. Find the length of the longest sub-sequence such that elements in the
subsequence are consecutive integers, the consecutive numbers can be in any order.
Examples:
Input: arr[] = [2, 6, 1, 9, 4, 5, 3]
Output: 6
Explanation: The consecutive numbers here are 1, 2, 3, 4, 5, 6. These 6 numbers form the longest consecutive subsquence.*/

class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int findLongestConseqSubseq(int[] arr) {
        // code here
        int longStreak=0;
        HashSet<Integer> ans=new HashSet<>();
        
        for(int i=0;i<arr.length;i++)
        {
            ans.add(arr[i]);
        }
        for(int i=0;i<arr.length;i++)
        {
            if(!ans.contains(arr[i]-1))
            {
                int currnum=arr[i];
                int CurrentStreak=1;
                
                while(ans.contains(currnum+1))
                {
                    CurrentStreak++;
                    currnum++;
                }
                longStreak=Math.max(longStreak,CurrentStreak);
            }
            
            
        }
        return longStreak;
        
    }
}
