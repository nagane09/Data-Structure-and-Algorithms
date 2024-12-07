/*Given an array and a range a, b. The task is to partition the array around the range such that the array is divided into three parts.
1) All elements smaller than a come first.
2) All elements in range a to b come next.
3) All elements greater than b appear in the end.
The individual elements of three sets can appear in any order. You are required to return the modified array.

Examples:

Input: arr[] = [1, 2, 3, 3, 4], a = 1, b = 2
Output: true
Explanation: One possible arrangement is: {1, 2, 3, 3, 4}. If you return a valid arrangement, output will be true.*/


class Solution {
    // Function to partition the array around the range such
    // that array is divided into three parts
    public List<Integer> threeWayPartition(int arr[], int a, int b) {
        // code here
        List<Integer> ans=new ArrayList<>();
        int mid=0;
        int low=0;
        int high=arr.length-1;
        while(mid<=high)
        {
            if(arr[mid]<a)
            {
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                mid++;
                low++;
            }
            else if(arr[mid]>b )
            {
                
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
            else
            {
                mid++;
            }
        }
        for(int i:arr)
        {
            ans.add(i);
        }
        return ans;
        
    }
}
