class Solution {
    public int partition(int[] arr,int si,int ei)
    {
        int i=si-1;
        int pivot=arr[ei];
        
        for(int j=si;j<ei;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=arr[ei];
        arr[ei]=temp;
        return i;
    }

    public void quickSort(int[] arr,int si,int ei)
    {
        if(si>=ei)
        {
            return;
        }
        int pivotIdx=partition(arr,si,ei);
        quickSort(arr,si,pivotIdx-1);
        quickSort(arr,pivotIdx+1,ei);
        
    }
    
    public static int kthSmallest(int[] arr, int k) {
        Solution obj=new Solution();
        obj.quickSort(arr,0,arr.length-1);
        return arr[k-1];
    }
}
