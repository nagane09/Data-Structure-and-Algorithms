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
