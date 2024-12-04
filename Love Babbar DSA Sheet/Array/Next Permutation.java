/*Given an array of integers arr[] representing a permutation, implement the next permutation that rearranges the numbers 
into the lexicographically next greater permutation. If no such permutation exists, rearrange the numbers into the lowest
possible order (i.e., sorted in ascending order). 
Note - A permutation of an array of integers refers to a specific arrangement of its elements in a sequence or linear order.

Examples:
Input: arr = [2, 4, 1, 7, 5, 0]
Output: [2, 4, 5, 0, 1, 7]
Explanation: The next permutation of the given array is {2, 4, 5, 0, 1, 7}.

Input: arr = [3, 2, 1]
Output: [1, 2, 3]
Explanation: As arr[] is the last permutation, the next permutation is the lowest one.

Input: arr = [3, 4, 2, 5, 1]
Output: [3, 4, 5, 1, 2]
Explanation: The next permutation of the given array is {3, 4, 5, 1, 2}.*/

class Solution {
    void nextPermutation(int[] arr) {
        // code here
        int k=-1;
        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[i]<arr[i+1]){
                k=i;
                break;
            }
        }
        
        if(k==-1)
        {
            rev(arr,0,arr.length-1);
            return;
        }
        
        int l=-1;
        for(int i=arr.length-1;i>k;i--)
        {
            if(arr[i]>arr[k])
            {
                l=i;
                break;
            }
        }
        
        int temp=arr[k];
        arr[k]=arr[l];
        arr[l]=temp;
        
        rev(arr,k+1,arr.length-1);
        
    }
    
    public void rev(int[] arr,int i,int j)
    {
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        
    }
}

/*1. **Find the first decreasing pair**: Traverse the array from right to left, and find the first element `arr[k]` 
where `arr[k] < arr[k + 1]`. This indicates the point where we need to make a change.
2. **Find the next larger element**: From the right, find the first element `arr[l]` greater than `arr[k]`.
3. **Swap elements**: Swap `arr[k]` with `arr[l]`.
4. **Reverse the subarray**: Reverse the part of the array after index `k` to get the smallest lexicographical order.

Example Walkthrough:
For the input `[1, 2, 3]`:
- Find `k = 1` (where `arr[k] < arr[k+1]`).
- Find `l = 2` (where `arr[l] > arr[k]`).
- Swap `arr[1]` and `arr[2]` → `[1, 3, 2]`.
- Reverse the subarray from index `2` → No change.

**Output:** `[1, 3, 2]`.*/

