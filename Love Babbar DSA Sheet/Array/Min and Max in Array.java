class Solution {
    public Pair<Long, Long> getMinMax(int[] arr) {
        // Code Here
        if(arr.length==0||arr==null)
        {
            return new Pair<>(null,null);
        }
        long min=Long.MAX_VALUE;
        long max=Long.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
            if(arr[i]>max)
            {
                max=arr[i];
            }
            
        }
        return new Pair<>(min,max);
        
    }
}
