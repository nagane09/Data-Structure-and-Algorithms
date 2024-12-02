/*Input: arr[] = [1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9]
Output: 3 
Explanation: First jump from 1st element to 2nd element with value 3. From here we jump to 5th element with value 9, and from here we will jump to the last. 

Input: arr = [1, 4, 3, 2, 6, 7]
Output: 2 
Explanation: First we jump from the 1st to 2nd element and then jump to the last element.

Input: arr = [0, 10, 20]
Output: -1
Explanation: We cannot go anywhere from the 1st element.*/

class Solution {
    static int minJumps(int[] arr) {
        // code here
        if (arr == null || arr.length <= 1) {
            return 0;
        }
        if(arr[0]==0)
        {
            return -1;
        }
        
        int i=0;
        int j=0;
        int count=0;
        
        for(int k=0;k<arr.length;k++)
        {
            
            i=Math.max(i,k+arr[k]);
            if(k==j)
            {
                count++;
                j=i;
                
                if(j>=arr.length-1)
                {
                    return count;
                }
            }
            if(k==i)
            {
                return -1;
            }
            
        }
        return -1;
        
    }
}
