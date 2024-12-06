class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
         HashSet<Integer> a1 = new HashSet<>();    //TC:-O(1)
        
        for(int i=0;i<a.length;i++)
        {
            a1.add(a[i]);
        }
        
        for(int i=0;i<b.length;i++)
        {
            if(!a1.contains(b[i]))
            {
                return false;
            }
        }
        return true;
    }
}
