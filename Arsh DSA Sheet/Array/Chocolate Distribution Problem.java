/*Given an array arr[] of positive integers, where each value represents the number of chocolates in a packet. Each packet can have a 
variable number of chocolates. There are m students, the task is to distribute chocolate packets among m students such that -
      i. Each student gets exactly one packet.
     ii. The difference between maximum number of chocolates given to a student and minimum number of chocolates given to a student
     is minimum and return that minimum possible difference.*/

class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        int n=arr.size();
        Collections.sort(arr);
        
        if(n<m)
        {
            return -1;
        }
        
        int minDiff=Integer.MAX_VALUE;
        
        for(int i=0;i+m-1<n;i++)
        {
            int diff=arr.get(i+m-1)-arr.get(i);
            minDiff=Math.min(diff,minDiff);
        }
        return minDiff;
    }
    
    public static void main(String[] args)
    {
        Solution sc=new Solution();
        Scanner scc=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<>();
        int m=scc.nextInt();
        
        System.out.println(sc.findMinDiff(arr,m));
       
        
    }
}


/*We now evaluate the difference between the largest and smallest elements in each window of size 7:

For the window {2, 4, 7, 9, 12, 23, 25}, the difference is 25 - 2 = 23.
For the window {4, 7, 9, 12, 23, 25, 28}, the difference is 28 - 4 = 24.
For the window {7, 9, 12, 23, 25, 28, 30}, the difference is 30 - 7 = 23.
For the window {9, 12, 23, 25, 28, 30, 40}, the difference is 40 - 9 = 31.
And so on...
The smallest difference found is 23, so the function returns 23.*/
