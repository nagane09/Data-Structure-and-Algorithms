class Solution {
    // Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int k) {
        // your code here,return the answer
        int n=arr.length/k;
        int count=0;
        Map<Integer,Integer> maps=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            maps.put(arr[i],maps.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> i:maps.entrySet())
        {
            if(i.getValue()>n)
            {
                count++;
            }
        }
        return count;
    }
}
