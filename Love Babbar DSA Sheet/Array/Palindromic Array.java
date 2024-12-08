/*Given an array arr[] of positive integers. Return true if all the array elements are palindrome otherwise, return false.

Examples:

Input: arr[] = [111, 222, 333, 444, 555]
Output: true
Explanation:
arr[0] = 111, which is a palindrome number.
arr[1] = 222, which is a palindrome number.
arr[2] = 333, which is a palindrome number.
arr[3] = 444, which is a palindrome number.
arr[4] = 555, which is a palindrome number.
As all numbers are palindrome so This will return true.*/

class Solution {
    public boolean isPalindrome(int num)
    {
        int original=num;
        int reversed=0;
        while(num>0)
        {
            int digit=num%10;
            reversed=reversed*10+digit;
            num=num/10;
            
        }
        return original==reversed;
    }
    public boolean palinArray(int[] arr) {
        // add code here.
        for(int num:arr)
        {
            if(!isPalindrome(num))
            {
                return false;
            }
            
        }
        return true;
        
    }
}
