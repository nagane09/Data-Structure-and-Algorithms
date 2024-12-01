class Solution {
    public void segregateElements(int[] arr) {
        
        List<int>negative=new ArrayList<>();
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
            {
                negative.add(arr[i]);
            }
            else
            {
                arr[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<negative.size();i++)
        {
            arr[j]=negative.get(i);
            j++;
        }
    }
}
