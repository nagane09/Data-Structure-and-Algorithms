class Solution {
    public static int findUnion(int a[], int b[]) {
        // code here
        // Create a HashSet to store unique elements
        HashSet<Integer> ans=new HashSet<>();
        
        for(int i=0;i<a.length;i++)
        {
            ans.add(a[i]);
        }
        for(int i=0;i<b.length;i++)
        {
            ans.add(b[i]);
        }
        return ans.size();
    }
}
