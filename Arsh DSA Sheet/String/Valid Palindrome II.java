/*Given a string s, return true if the s can be palindrome after deleting at most one character from it.

Example 1:
Input: s = "aba"
Output: true

Example 2:
Input: s = "abca"
Output: true
Explanation: You could delete the character 'c'.*/

class Solution {
    public boolean isPallindrome(String s,int left,int right)
    {
        while(left<right)
        {
            if(s.charAt(left)!=s.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public boolean validPalindrome(String s) {
        int left=0;
        int right=s.length()-1;

        while(left<right)
        {
            if(s.charAt(left)!=s.charAt(right))
            {
                 return isPallindrome(s,left+1,right)||isPallindrome(s,left,right-1);
            }
            left++;
            right--;
        }
        return true;
    }
    
}
