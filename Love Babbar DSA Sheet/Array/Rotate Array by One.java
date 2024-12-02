class Solution {
    public void rotate(int[] arr) {
        // code here
        int last=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--)
        {
            arr[i+1]=arr[i];
        }
        arr[0]=last;
    }
}

//Input: arr = [1, 2, 3, 4, 5]
//Output: [5, 1, 2, 3, 4]
//Explanation: If we rotate arr by one position in clockwise 5 come to the front and remaining those are shifted to the end.
