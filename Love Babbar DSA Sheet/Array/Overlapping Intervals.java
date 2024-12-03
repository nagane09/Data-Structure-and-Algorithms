/*Input: arr[][] = [[1,3],[2,4],[6,8],[9,10]]
Output: [[1,4], [6,8], [9,10]]*/

class Solution {
    public List<int[]> mergeOverlap(int[][] arr) {
        // Code here 
        if (arr == null || arr.length == 0) {
            return new ArrayList<>();
        }
        
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        List<int[]> ans=new ArrayList<>();
        
        int[] current=arr[0];
        
        for(int i=1;i<arr.length;i++)
        {
            if(current[1]>=arr[i][0])
            {
                current[1]=Math.max(current[1],arr[i][1]);   //comparing the the 2nd element of 2 sets
            }
            else
            {
                ans.add(current);
                current=arr[i];
            }
        }
        ans.add(current);
        return ans;
    }
}
